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

import com.meustickets.meustickets.entity.TipoEvento;
import com.meustickets.meustickets.repository.TipoEventoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "TipoEvento", description = "Gerenciamento de tipoEventos")
public class TipoEventoResource {
	
	@Autowired
	TipoEventoRepository tipoEventoRepository;
	
	@GetMapping("/tipoEventos")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os tipoEventos."
		)
	public List<TipoEvento> listaTipoEventos(){
		return tipoEventoRepository.findAll();		
	}
	
	@GetMapping("/tipoEvento")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um tipoEvento específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<TipoEvento> buscaTipoEvento(@RequestParam long id){
		if (!tipoEventoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoEvento não encontrado");
	    }
		return tipoEventoRepository.findById(id);	
	}

	@PostMapping("/tipoEvento")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo tipoEvento."
		)
	public TipoEvento salvaTipoEvento(@RequestBody TipoEvento tipoEvento) {
		return tipoEventoRepository.save(tipoEvento);
	}
	
	@DeleteMapping("/tipoEvento/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um tipoEvento por id."
		)
	public void deleteTipoEvento(@PathVariable long id) {
	    if (!tipoEventoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoEvento não encontrado");
	    }
	    tipoEventoRepository.deleteById(id);
	}
	
	@PutMapping("/tipoEvento/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um tipoEvento por id."
		)
	public TipoEvento atualizaTipoEvento(@PathVariable long id, @RequestBody TipoEvento tipoEvento) {
	    if (!tipoEventoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "TipoEvento não encontrado");
	    }
	    tipoEvento.setId(id);
	    return tipoEventoRepository.save(tipoEvento);
	}
		

}
