package com.meustickets.meusticketsapi.service.pessoa;

import java.util.List;

import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.BuscarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.DeletarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.ListarPessoasResponse;

public interface PessoaService {

    List<ListarPessoasResponse> listarPessoas();
    
    CadastrarPessoaResponse cadastrarPessoa(CadastrarPessoaRequest cadastrarPessoaRequest);

    AtualizarPessoaResponse atualizarPessoa(AtualizarPessoaRequest atualizarPessoaRequest);

    BuscarPessoaResponse buscarPessoa(Long idPessoa);

    void deletarPessoa(DeletarPessoaRequest deletarPessoaRequest);

}
