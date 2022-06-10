package com.meustickets.meusticketsapi.service.pessoa;

import java.util.ArrayList;
import java.util.List;

import com.meustickets.meusticketsapi.persistence.entity.Pessoa;
import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.AtualizarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.BuscarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.CadastrarPessoaResponse;
import com.meustickets.meusticketsapi.webApi.model.pessoa.DeletarPessoaRequest;
import com.meustickets.meusticketsapi.webApi.model.pessoa.ListarPessoasResponse;

public class PessoaMapper {

    public Pessoa cadastrarPessoaRequest(CadastrarPessoaRequest cadastrarPessoaRequest){
        Pessoa pessoa = new Pessoa();

        pessoa.setNome(cadastrarPessoaRequest.getNome());
        pessoa.setEmail(cadastrarPessoaRequest.getEmail());
        pessoa.setPassword(cadastrarPessoaRequest.getPassword());
        pessoa.setTipoPessoa(cadastrarPessoaRequest.getTipoPessoa());
        pessoa.setCpfCnpj(cadastrarPessoaRequest.getCpfCnpj());
        pessoa.setIndAceitaTermos(cadastrarPessoaRequest.getIndAceitaTermos());
        pessoa.setIndEnvioEmail(cadastrarPessoaRequest.getIndEnvioEmail());
        pessoa.setPerfil(cadastrarPessoaRequest.getPerfil());
        pessoa.setSexo(cadastrarPessoaRequest.getSexo());
        pessoa.setDataNascimento(cadastrarPessoaRequest.getDataNascimento());
        pessoa.setAvatarFileName(cadastrarPessoaRequest.getAvatarFileName());
        pessoa.setAvatarContentType(cadastrarPessoaRequest.getAvatarContentType());
        pessoa.setAvatarFileSize(cadastrarPessoaRequest.getAvatarFileSize());
        pessoa.setAvatarUpdatedAt(cadastrarPessoaRequest.getAvatarUpdatedAt());
        pessoa.setSlug(cadastrarPessoaRequest.getSlug());
        return pessoa;
    }
    
    public CadastrarPessoaResponse cadastrarPessoaResponse(Pessoa pessoa){

        CadastrarPessoaResponse cadastrarPessoaResponse = new CadastrarPessoaResponse();

        cadastrarPessoaResponse.setIdPessoa(pessoa.getIdPessoa());
        cadastrarPessoaResponse.setNome(pessoa.getNome());
        cadastrarPessoaResponse.setEmail(pessoa.getEmail());
        cadastrarPessoaResponse.setPassword(pessoa.getPassword());
        cadastrarPessoaResponse.setTipoPessoa(pessoa.getTipoPessoa());
        cadastrarPessoaResponse.setCpfCnpj(pessoa.getCpfCnpj());
        cadastrarPessoaResponse.setIndAceitaTermos(pessoa.getIndAceitaTermos());
        cadastrarPessoaResponse.setIndEnvioEmail(pessoa.getIndEnvioEmail());
        cadastrarPessoaResponse.setPerfil(pessoa.getPerfil());
        cadastrarPessoaResponse.setSexo(pessoa.getSexo());
        cadastrarPessoaResponse.setDataNascimento(pessoa.getDataNascimento());
        cadastrarPessoaResponse.setAvatarFileName(pessoa.getAvatarFileName());
        cadastrarPessoaResponse.setAvatarContentType(pessoa.getAvatarContentType());
        cadastrarPessoaResponse.setAvatarFileSize(pessoa.getAvatarFileSize());
        cadastrarPessoaResponse.setAvatarUpdatedAt(pessoa.getAvatarUpdatedAt());
        cadastrarPessoaResponse.setSlug(pessoa.getSlug());

        return cadastrarPessoaResponse;
    }

    public Pessoa atualizarPessoaRequest(AtualizarPessoaRequest atualizarPessoaRequest){

        Pessoa pessoa = new Pessoa();

        pessoa.setIdPessoa(atualizarPessoaRequest.getIdPessoa());
        pessoa.setNome(atualizarPessoaRequest.getNome());
        pessoa.setEmail(atualizarPessoaRequest.getEmail());
        pessoa.setPassword(atualizarPessoaRequest.getPassword());
        pessoa.setTipoPessoa(atualizarPessoaRequest.getTipoPessoa());
        pessoa.setCpfCnpj(atualizarPessoaRequest.getCpfCnpj());
        pessoa.setIndAceitaTermos(atualizarPessoaRequest.getIndAceitaTermos());
        pessoa.setIndEnvioEmail(atualizarPessoaRequest.getIndEnvioEmail());
        pessoa.setPerfil(atualizarPessoaRequest.getPerfil());
        pessoa.setSexo(atualizarPessoaRequest.getSexo());
        pessoa.setDataNascimento(atualizarPessoaRequest.getDataNascimento());
        pessoa.setAvatarFileName(atualizarPessoaRequest.getAvatarFileName());
        pessoa.setAvatarContentType(atualizarPessoaRequest.getAvatarContentType());
        pessoa.setAvatarFileSize(atualizarPessoaRequest.getAvatarFileSize());
        pessoa.setAvatarUpdatedAt(atualizarPessoaRequest.getAvatarUpdatedAt());
        pessoa.setSlug(atualizarPessoaRequest.getSlug());

        return pessoa;

    }

    public AtualizarPessoaResponse atualizarPessoaResponse(Pessoa pessoa){

        AtualizarPessoaResponse atualizarPessoaResponse = new AtualizarPessoaResponse();

        atualizarPessoaResponse.setIdPessoa(pessoa.getIdPessoa());
        atualizarPessoaResponse.setNome(pessoa.getNome());
        atualizarPessoaResponse.setEmail(pessoa.getEmail());
        atualizarPessoaResponse.setPassword(pessoa.getPassword());
        atualizarPessoaResponse.setTipoPessoa(pessoa.getTipoPessoa());
        atualizarPessoaResponse.setCpfCnpj(pessoa.getCpfCnpj());
        atualizarPessoaResponse.setIndAceitaTermos(pessoa.getIndAceitaTermos());
        atualizarPessoaResponse.setIndEnvioEmail(pessoa.getIndEnvioEmail());
        atualizarPessoaResponse.setPerfil(pessoa.getPerfil());
        atualizarPessoaResponse.setSexo(pessoa.getSexo());
        atualizarPessoaResponse.setDataNascimento(pessoa.getDataNascimento());
        atualizarPessoaResponse.setAvatarFileName(pessoa.getAvatarFileName());
        atualizarPessoaResponse.setAvatarContentType(pessoa.getAvatarContentType());
        atualizarPessoaResponse.setAvatarFileSize(pessoa.getAvatarFileSize());
        atualizarPessoaResponse.setAvatarUpdatedAt(pessoa.getAvatarUpdatedAt());
        atualizarPessoaResponse.setSlug(pessoa.getSlug());

        return atualizarPessoaResponse;

    }

    public BuscarPessoaResponse buscarPessoaResponse(Pessoa pessoa){
        BuscarPessoaResponse buscarPessoaResponse = new BuscarPessoaResponse();

        buscarPessoaResponse.setIdPessoa(pessoa.getIdPessoa());
        buscarPessoaResponse.setNome(pessoa.getNome());
        buscarPessoaResponse.setEmail(pessoa.getEmail());
        buscarPessoaResponse.setPassword(pessoa.getPassword());
        buscarPessoaResponse.setTipoPessoa(pessoa.getTipoPessoa());
        buscarPessoaResponse.setCpfCnpj(pessoa.getCpfCnpj());
        buscarPessoaResponse.setIndAceitaTermos(pessoa.getIndAceitaTermos());
        buscarPessoaResponse.setIndEnvioEmail(pessoa.getIndEnvioEmail());
        buscarPessoaResponse.setPerfil(pessoa.getPerfil());
        buscarPessoaResponse.setSexo(pessoa.getSexo());
        buscarPessoaResponse.setDataNascimento(pessoa.getDataNascimento());
        buscarPessoaResponse.setAvatarFileName(pessoa.getAvatarFileName());
        buscarPessoaResponse.setAvatarContentType(pessoa.getAvatarContentType());
        buscarPessoaResponse.setAvatarFileSize(pessoa.getAvatarFileSize());
        buscarPessoaResponse.setAvatarUpdatedAt(pessoa.getAvatarUpdatedAt());
        buscarPessoaResponse.setSlug(pessoa.getSlug());

        return buscarPessoaResponse;
    }

    public List<ListarPessoasResponse> listarPessoasResponse(List<Pessoa> pessoas){
        List<ListarPessoasResponse> listarPessoasResponse = new ArrayList<ListarPessoasResponse>();
        
        for (Pessoa pessoa : pessoas) {
            ListarPessoasResponse response = new ListarPessoasResponse();
            response.setIdPessoa(pessoa.getIdPessoa());
            response.setNome(pessoa.getNome());
            response.setEmail(pessoa.getEmail());
            response.setPassword(pessoa.getPassword());
            response.setTipoPessoa(pessoa.getTipoPessoa());
            response.setCpfCnpj(pessoa.getCpfCnpj());
            response.setIndAceitaTermos(pessoa.getIndAceitaTermos());
            response.setIndEnvioEmail(pessoa.getIndEnvioEmail());
            response.setPerfil(pessoa.getPerfil());
            response.setSexo(pessoa.getSexo());
            response.setDataNascimento(pessoa.getDataNascimento());
            response.setAvatarFileName(pessoa.getAvatarFileName());
            response.setAvatarContentType(pessoa.getAvatarContentType());
            response.setAvatarFileSize(pessoa.getAvatarFileSize());
            response.setAvatarUpdatedAt(pessoa.getAvatarUpdatedAt());
            response.setSlug(pessoa.getSlug());
            
            listarPessoasResponse.add(response);
        }
        return listarPessoasResponse;
    }

    public Pessoa deletarPessoaRequest(DeletarPessoaRequest deletarPessoaRequest){
        Pessoa pessoa = new Pessoa();
        
        pessoa.setIdPessoa(deletarPessoaRequest.getIdPessoa());

        return pessoa;

    }

}
