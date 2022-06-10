package com.meustickets.meusticketsapi.webApi.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;

import com.meustickets.meusticketsapi.service.pessoa.PessoaServiceImpl;
import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.BuscarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.DeletarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.ListarPessoasResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value="API REST Usuário", tags = "Pessoa", description = " ")
public class PessoaController {
    
    @Autowired
    private PessoaServiceImpl pessoaServico;

    @ApiOperation(value="Retorna uma lista de Usuários")
    @GetMapping(value="/pessoas")
    public List<ListarPessoasResponse> listarPessoas() {
        return pessoaServico.listarPessoas();
    }
    
    @ApiOperation(value = "Retorna um Usuário")
    @GetMapping(value = "/pessoa/{idPessoa}")
    public BuscarPessoaResponse buscarPessoa(@PathVariable(value = "idPessoa")Long idPessoa){
        return pessoaServico.buscarPessoa(idPessoa);
    }

    @ApiOperation(value = "Cadastra nova Usuário")
    @PostMapping(value = "/pessoa")
    public CadastrarPessoaResponse cadastrarPessoa(@RequestBody @Valid CadastrarPessoaRequest cadastrarPessoaRequest){
        return pessoaServico.cadastrarPessoa(cadastrarPessoaRequest);
    }

    @ApiOperation(value = "Atualiza cadastro de Usuário")
    @PutMapping(value = "/pessoa")
    public AtualizarPessoaResponse atualizarPessoa(@RequestBody AtualizarPessoaRequest atualizarPessoaRequest){
        return pessoaServico.atualizarPessoa(atualizarPessoaRequest);
    }

    @ApiOperation(value = "Deleta cadastro de Usuário")
    @DeleteMapping(value = "pessoa")
    public void deletarPessoa(@RequestBody DeletarPessoaRequest deletarPessoaRequest){
        pessoaServico.deletarPessoa(deletarPessoaRequest);
    }

}