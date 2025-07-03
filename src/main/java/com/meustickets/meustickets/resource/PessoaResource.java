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

import com.meustickets.meustickets.entity.Pessoa;
import com.meustickets.meustickets.repository.PessoaRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "Pessoa", description = "Gerenciamento de pessoas")
public class PessoaResource {
	
	@Autowired
	PessoaRepository pessoaRepository;
	
	@GetMapping("/pessoas")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os pessoas."
		)
	public List<Pessoa> listaPessoas(){
		return pessoaRepository.findAll();		
	}
	
	@GetMapping("/pessoa")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um pessoa específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<Pessoa> buscaPessoa(@RequestParam long id){
		if (!pessoaRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrado");
	    }
		return pessoaRepository.findById(id);	
	}

	@PostMapping("/pessoa")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo pessoa."
		)
	public Pessoa salvaPessoa(@RequestBody Pessoa pessoa) {
		return pessoaRepository.save(pessoa);
	}
	
	@DeleteMapping("/pessoa/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um pessoa por id."
		)
	public void deletePessoa(@PathVariable long id) {
	    if (!pessoaRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrado");
	    }
	    pessoaRepository.deleteById(id);
	}
	
	@PutMapping("/pessoa/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um pessoa por id."
		)
	public Pessoa atualizaPessoa(@PathVariable long id, @RequestBody Pessoa pessoa) {
	    if (!pessoaRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Pessoa não encontrado");
	    }
	    pessoa.setId(id);
	    return pessoaRepository.save(pessoa);
	}
		

}
