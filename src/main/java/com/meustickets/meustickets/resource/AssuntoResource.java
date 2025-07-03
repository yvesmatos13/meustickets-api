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

import com.meustickets.meustickets.entity.Assunto;
import com.meustickets.meustickets.repository.AssuntoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "Assunto", description = "Gerenciamento de assuntos")
public class AssuntoResource {
	
	@Autowired
	AssuntoRepository assuntoRepository;
	
	@GetMapping("/assuntos")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os assuntos."
		)
	public List<Assunto> listaAssuntos(){
		return assuntoRepository.findAll();		
	}
	
	@GetMapping("/assunto")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um assunto específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<Assunto> buscaAssunto(@RequestParam long id){
		if (!assuntoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Assunto não encontrado");
	    }
		return assuntoRepository.findById(id);	
	}

	@PostMapping("/assunto")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo assunto."
		)
	public Assunto salvaAssunto(@RequestBody Assunto assunto) {
		return assuntoRepository.save(assunto);
	}
	
	@DeleteMapping("/assunto/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um assunto por id."
		)
	public void deleteAssunto(@PathVariable long id) {
	    if (!assuntoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Assunto não encontrado");
	    }
	    assuntoRepository.deleteById(id);
	}
	
	@PutMapping("/assunto/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um assunto por id."
		)
	public Assunto atualizaAssunto(@PathVariable long id, @RequestBody Assunto assunto) {
	    if (!assuntoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Assunto não encontrado");
	    }
	    assunto.setId(id);
	    return assuntoRepository.save(assunto);
	}
		

}
