package com.meustickets.meustickets.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.meustickets.meustickets.entity.Ingresso;
import com.meustickets.meustickets.repository.IngressoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "Ingresso", description = "Gerenciamento de ingressos")
public class IngressoResource {
	
	@Autowired
	IngressoRepository ingressoRepository;
	
	@GetMapping("/ingressos")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os ingressos."
		)
	public List<Ingresso> listaIngressos(){
		return ingressoRepository.findAll();		
	}
	
	@GetMapping("/ingresso")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um ingresso específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<Ingresso> buscaIngresso(@RequestParam long id){
		if (!ingressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingresso não encontrado");
	    }
		return ingressoRepository.findById(id);	
	}

	@PostMapping("/ingresso")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo ingresso."
		)
	public Ingresso salvaIngresso(@RequestBody Ingresso ingresso) {
		return ingressoRepository.save(ingresso);
	}
	
	@DeleteMapping("/ingresso/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um ingresso por id."
		)
	public void deleteIngresso(@PathVariable long id) {
	    if (!ingressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingresso não encontrado");
	    }
	    ingressoRepository.deleteById(id);
	}
	
	@PutMapping("/ingresso/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um ingresso por id."
		)
	public Ingresso atualizaIngresso(@PathVariable long id, @RequestBody Ingresso ingresso) {
	    if (!ingressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Ingresso não encontrado");
	    }
	    ingresso.setId(id);
	    return ingressoRepository.save(ingresso);
	}
		

}
