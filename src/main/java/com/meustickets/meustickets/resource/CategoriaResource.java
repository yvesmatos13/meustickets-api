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

import com.meustickets.meustickets.entity.Categoria;
import com.meustickets.meustickets.repository.CategoriaRepository;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
@Tag(name = "Categoria", description = "Gerenciamento de categorias")
public class CategoriaResource {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@GetMapping("/categorias")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Listar",
		    description = "Retorna todos os categorias."
		)
	public List<Categoria> listaCategorias(){
		return categoriaRepository.findAll();		
	}
	
	@GetMapping("/categoria")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Buscar",
		    description = "Retorna um categoria específico a partir do id fornecido. Retorna 404 caso não exista."
		)
	public Optional<Categoria> buscaCategoria(@RequestParam long id){
		if (!categoriaRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrado");
	    }
		return categoriaRepository.findById(id);	
	}

	@PostMapping("/categoria")
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(
		    summary = "Salvar",
		    description = "Salva um novo categoria."
		)
	public Categoria salvaCategoria(@RequestBody Categoria categoria) {
		return categoriaRepository.save(categoria);
	}
	
	@DeleteMapping("/categoria/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Operation(
		    summary = "Deletar",
		    description = "deleta um categoria por id."
		)
	public void deleteCategoria(@PathVariable long id) {
	    if (!categoriaRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrado");
	    }
	    categoriaRepository.deleteById(id);
	}
	
	@PutMapping("/categoria/{id}")
	@ResponseStatus(HttpStatus.OK)
	@Operation(
		    summary = "Atualizar",
		    description = "Atualiza um categoria por id."
		)
	public Categoria atualizaCategoria(@PathVariable long id, @RequestBody Categoria categoria) {
	    if (!categoriaRepository.existsById(id)) {
	        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Categoria não encontrado");
	    }
	    categoria.setId(id);
	    return categoriaRepository.save(categoria);
	}
		

}
