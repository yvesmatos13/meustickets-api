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

import com.meustickets.meustickets.entity.NomenclaturaIngresso;
import com.meustickets.meustickets.repository.NomenclaturaIngressoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "NomenclaturaIngresso", description = "Gerenciamento de nomenclaturaIngressos")
public class NomenclaturaIngressoResource {
	
	@Autowired
	NomenclaturaIngressoRepository nomenclaturaIngressoRepository;
	
	@GetMapping("/nomenclaturaIngressos")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os nomenclaturaIngressos."
		)
	public List<NomenclaturaIngresso> listaNomenclaturaIngressos(){
		return nomenclaturaIngressoRepository.findAll();		
	}
	
	@GetMapping("/nomenclaturaIngresso")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um nomenclaturaIngresso específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<NomenclaturaIngresso> buscaNomenclaturaIngresso(@RequestParam long id){
		if (!nomenclaturaIngressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NomenclaturaIngresso não encontrado");
	    }
		return nomenclaturaIngressoRepository.findById(id);	
	}

	@PostMapping("/nomenclaturaIngresso")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo nomenclaturaIngresso."
		)
	public NomenclaturaIngresso salvaNomenclaturaIngresso(@RequestBody NomenclaturaIngresso nomenclaturaIngresso) {
		return nomenclaturaIngressoRepository.save(nomenclaturaIngresso);
	}
	
	@DeleteMapping("/nomenclaturaIngresso/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um nomenclaturaIngresso por id."
		)
	public void deleteNomenclaturaIngresso(@PathVariable long id) {
	    if (!nomenclaturaIngressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NomenclaturaIngresso não encontrado");
	    }
	    nomenclaturaIngressoRepository.deleteById(id);
	}
	
	@PutMapping("/nomenclaturaIngresso/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um nomenclaturaIngresso por id."
		)
	public NomenclaturaIngresso atualizaNomenclaturaIngresso(@PathVariable long id, @RequestBody NomenclaturaIngresso nomenclaturaIngresso) {
	    if (!nomenclaturaIngressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "NomenclaturaIngresso não encontrado");
	    }
	    nomenclaturaIngresso.setId(id);
	    return nomenclaturaIngressoRepository.save(nomenclaturaIngresso);
	}
		

}
