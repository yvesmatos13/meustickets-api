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

import com.meustickets.meustickets.entity.Lote;
import com.meustickets.meustickets.repository.LoteRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "Lote", description = "Gerenciamento de lotes")
public class LoteResource {
	
	@Autowired
	LoteRepository loteRepository;
	
	@GetMapping("/lotes")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os lotes."
		)
	public List<Lote> listaLotes(){
		return loteRepository.findAll();		
	}
	
	@GetMapping("/lote")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um lote específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<Lote> buscaLote(@RequestParam long id){
		if (!loteRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lote não encontrado");
	    }
		return loteRepository.findById(id);	
	}

	@PostMapping("/lote")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo lote."
		)
	public Lote salvaLote(@RequestBody Lote lote) {
		return loteRepository.save(lote);
	}
	
	@DeleteMapping("/lote/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um lote por id."
		)
	public void deleteLote(@PathVariable long id) {
	    if (!loteRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lote não encontrado");
	    }
	    loteRepository.deleteById(id);
	}
	
	@PutMapping("/lote/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um lote por id."
		)
	public Lote atualizaLote(@PathVariable long id, @RequestBody Lote lote) {
	    if (!loteRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Lote não encontrado");
	    }
	    lote.setId(id);
	    return loteRepository.save(lote);
	}
		

}
