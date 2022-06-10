package com.meustickets.meusticketsapi.service.pessoa;

import java.util.List;

import javax.transaction.Transactional;

import com.meustickets.meusticketsapi.persistence.repository.PessoaRepository;
import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.BuscarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.DeletarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.ListarPessoasResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class PessoaServiceImpl implements PessoaService {

    @Autowired
    private PessoaRepository pessoaRepository;

    private PessoaMapper pessoaMapeamento = new PessoaMapper();

    @Override
    public List<ListarPessoasResponse> listarPessoas() {
        return pessoaMapeamento.listarPessoasResponse(pessoaRepository.findAll());
    }

    @Override
    public CadastrarPessoaResponse cadastrarPessoa(CadastrarPessoaRequest cadastrarPessoaRequest) {

        return pessoaMapeamento.cadastrarPessoaResponse(pessoaRepository
                .save(pessoaMapeamento
                        .cadastrarPessoaRequest(cadastrarPessoaRequest)));
    }

    @Override
    public AtualizarPessoaResponse atualizarPessoa(AtualizarPessoaRequest atualizarPessoaRequest) {

        return pessoaMapeamento.atualizarPessoaResponse(pessoaRepository
                .save(pessoaMapeamento
                        .atualizarPessoaRequest(atualizarPessoaRequest)));

    }

    @Override
    public BuscarPessoaResponse buscarPessoa(Long idPessoa) {
        return pessoaMapeamento.buscarPessoaResponse(pessoaRepository.findByIdPessoa(idPessoa).get());
    }

    @Override
    public void deletarPessoa(DeletarPessoaRequest deletarPessoaRequest) {
        pessoaRepository.delete(pessoaMapeamento.deletarPessoaRequest(deletarPessoaRequest));
    }

}
