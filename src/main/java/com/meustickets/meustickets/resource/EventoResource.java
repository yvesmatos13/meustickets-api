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

import com.meustickets.meustickets.entity.Evento;
import com.meustickets.meustickets.repository.EventoRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "Evento", description = "Gerenciamento de eventos")
public class EventoResource {
	
	@Autowired
	EventoRepository eventoRepository;
	
	@GetMapping("/eventos")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os eventos."
		)
	public List<Evento> listaEventos(){
		return eventoRepository.findAll();		
	}
	
	@GetMapping("/evento")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um evento específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<Evento> buscaEvento(@RequestParam long id){
		if (!eventoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Evento não encontrado");
	    }
		return eventoRepository.findById(id);	
	}

	@PostMapping("/evento")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo evento."
		)
	public Evento salvaEvento(@RequestBody Evento evento) {
		return eventoRepository.save(evento);
	}
	
	@DeleteMapping("/evento/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um evento por id."
		)
	public void deleteEvento(@PathVariable long id) {
	    if (!eventoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Evento não encontrado");
	    }
	    eventoRepository.deleteById(id);
	}
	
	@PutMapping("/evento/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um evento por id."
		)
	public Evento atualizaEvento(@PathVariable long id, @RequestBody Evento evento) {
	    if (!eventoRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Evento não encontrado");
	    }
	    evento.setId(id);
	    return eventoRepository.save(evento);
	}
		

}
