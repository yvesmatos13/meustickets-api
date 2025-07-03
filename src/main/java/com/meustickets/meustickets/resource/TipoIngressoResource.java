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

import com.meustickets.meustickets.entity.TipoIngresso;
import com.meustickets.meustickets.repository.TipoIngressoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "TipoIngresso", description = "Gerenciamento de tipoIngressos")
public class TipoIngressoResource {
	
	@Autowired
	TipoIngressoRepository tipoIngressoRepository;
	
	@GetMapping("/tipoIngressos")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os tipoIngressos."
		)
	public List<TipoIngresso> listaTipoIngressos(){
		return tipoIngressoRepository.findAll();		
	}
	
	@GetMapping("/tipoIngresso")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um tipoIngresso específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<TipoIngresso> buscaTipoIngresso(@RequestParam long id){
		if (!tipoIngressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoIngresso não encontrado");
	    }
		return tipoIngressoRepository.findById(id);	
	}

	@PostMapping("/tipoIngresso")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo tipoIngresso."
		)
	public TipoIngresso salvaTipoIngresso(@RequestBody TipoIngresso tipoIngresso) {
		return tipoIngressoRepository.save(tipoIngresso);
	}
	
	@DeleteMapping("/tipoIngresso/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um tipoIngresso por id."
		)
	public void deleteTipoIngresso(@PathVariable long id) {
	    if (!tipoIngressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoIngresso não encontrado");
	    }
	    tipoIngressoRepository.deleteById(id);
	}
	
	@PutMapping("/tipoIngresso/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um tipoIngresso por id."
		)
	public TipoIngresso atualizaTipoIngresso(@PathVariable long id, @RequestBody TipoIngresso tipoIngresso) {
	    if (!tipoIngressoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoIngresso não encontrado");
	    }
	    tipoIngresso.setId(id);
	    return tipoIngressoRepository.save(tipoIngresso);
	}
		

}
