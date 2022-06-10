package com.meustickets.meusticketsapi.service.evento;

import java.util.List;
import java.util.ArrayList;

import com.meustickets.meusticketsapi.persistence.entity.Evento;
import com.meustickets.meusticketsapi.persistence.entity.Pessoa;
import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.BuscarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.DeletarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.ListarEventosResponse;

public class EventoMapper {

    public Evento cadastrarEventoRequest(CadastrarEventoRequest cadastrarEventoRequest, Pessoa pessoa) {

        Evento evento = new Evento();

        evento.setPessoa(pessoa);
        evento.setIdTipoEvento(cadastrarEventoRequest.getIdTipoEvento());
        evento.setIdEventoPai(cadastrarEventoRequest.getIdEventoPai());
        evento.setNome(cadastrarEventoRequest.getNome());
        evento.setDescricao(cadastrarEventoRequest.getDescricao());
        evento.setSituacao(cadastrarEventoRequest.getSituacao());
        evento.setDataInicio(cadastrarEventoRequest.getDataInicio());
        evento.setDataFim(cadastrarEventoRequest.getDataFim());
        evento.setLocal(cadastrarEventoRequest.getLocal());
        evento.setEndereco(cadastrarEventoRequest.getEndereco());
        evento.setNumero(cadastrarEventoRequest.getNumero());
        evento.setComplemento(cadastrarEventoRequest.getComplemento());
        evento.setCep(cadastrarEventoRequest.getCep());
        evento.setBairro(cadastrarEventoRequest.getBairro());
        evento.setCidade(cadastrarEventoRequest.getCidade());
        evento.setUf(cadastrarEventoRequest.getUf());
        evento.setIndGratuito(cadastrarEventoRequest.getIndGratuito());
        evento.setIndOnline(cadastrarEventoRequest.getIndOnline());
        evento.setIndEnvioTrabalho(cadastrarEventoRequest.getIndEnvioTrabalho());
        evento.setEmail(cadastrarEventoRequest.getEmail());
        evento.setFoneContato(cadastrarEventoRequest.getFoneContato());
        evento.setUrlSite(cadastrarEventoRequest.getUrlSite());
        evento.setUrlVideo(cadastrarEventoRequest.getUrlVideo());
        evento.setBannerFileName(cadastrarEventoRequest.getBannerFileName());
        evento.setBannerFileSize(cadastrarEventoRequest.getBannerFileSize());
        evento.setBannerUpdateAt(cadastrarEventoRequest.getBannerUpdateAt());
        evento.setLogoFileName(cadastrarEventoRequest.getLogoFileName());
        evento.setLogoContentType(cadastrarEventoRequest.getLogoContentType());
        evento.setLogoFileSize(cadastrarEventoRequest.getLogoFileSize());
        evento.setLogoUpdateAt(cadastrarEventoRequest.getLogoUpdateAt());
        evento.setLatitude(cadastrarEventoRequest.getLatitude());
        evento.setLongitude(cadastrarEventoRequest.getLongitude());
        evento.setGoogleMaps(cadastrarEventoRequest.getGoogleMaps());
        evento.setSlug(cadastrarEventoRequest.getSlug());

        return evento;
    }

    public CadastrarEventoResponse cadastrarEventoResponse(Evento evento) {

        CadastrarEventoResponse cadastrarEventoResponse = new CadastrarEventoResponse();

        cadastrarEventoResponse.setIdEvento(evento.getIdEvento());
        cadastrarEventoResponse.setIdPessoa(evento.getIdPessoa());
        cadastrarEventoResponse.setIdTipoEvento(evento.getIdTipoEvento());
        cadastrarEventoResponse.setIdEventoPai(evento.getIdEventoPai());
        cadastrarEventoResponse.setNome(evento.getNome());
        cadastrarEventoResponse.setDescricao(evento.getDescricao());
        cadastrarEventoResponse.setSituacao(evento.getSituacao());
        cadastrarEventoResponse.setDataInicio(evento.getDataInicio());
        cadastrarEventoResponse.setDataFim(evento.getDataFim());
        cadastrarEventoResponse.setLocal(evento.getLocal());
        cadastrarEventoResponse.setEndereco(evento.getEndereco());
        cadastrarEventoResponse.setNumero(evento.getNumero());
        cadastrarEventoResponse.setComplemento(evento.getComplemento());
        cadastrarEventoResponse.setCep(evento.getCep());
        cadastrarEventoResponse.setBairro(evento.getBairro());
        cadastrarEventoResponse.setCidade(evento.getCidade());
        cadastrarEventoResponse.setUf(evento.getUf());
        cadastrarEventoResponse.setIndGratuito(evento.getIndGratuito());
        cadastrarEventoResponse.setIndOnline(evento.getIndOnline());
        cadastrarEventoResponse.setIndEnvioTrabalho(evento.getIndEnvioTrabalho());
        cadastrarEventoResponse.setEmail(evento.getEmail());
        cadastrarEventoResponse.setFoneContato(evento.getFoneContato());
        cadastrarEventoResponse.setUrlSite(evento.getUrlSite());
        cadastrarEventoResponse.setUrlVideo(evento.getUrlVideo());
        cadastrarEventoResponse.setBannerFileName(evento.getBannerFileName());
        cadastrarEventoResponse.setBannerFileSize(evento.getBannerFileSize());
        cadastrarEventoResponse.setBannerUpdateAt(evento.getBannerUpdateAt());
        cadastrarEventoResponse.setLogoFileName(evento.getLogoFileName());
        cadastrarEventoResponse.setLogoContentType(evento.getLogoContentType());
        cadastrarEventoResponse.setLogoFileSize(evento.getLogoFileSize());
        cadastrarEventoResponse.setLogoUpdateAt(evento.getLogoUpdateAt());
        cadastrarEventoResponse.setLatitude(evento.getLatitude());
        cadastrarEventoResponse.setLongitude(evento.getLongitude());
        cadastrarEventoResponse.setGoogleMaps(evento.getGoogleMaps());
        cadastrarEventoResponse.setSlug(evento.getSlug());

        return cadastrarEventoResponse;
    }

    public Evento atualizarEventoRequest(AtualizarEventoRequest atualizarEventoRequest, Pessoa pessoa) {

        Evento evento = new Evento();

        evento.setIdEvento(atualizarEventoRequest.getIdEvento());
        evento.setPessoa(pessoa);
        evento.setIdTipoEvento(atualizarEventoRequest.getIdTipoEvento());
        evento.setIdEventoPai(atualizarEventoRequest.getIdEventoPai());
        evento.setNome(atualizarEventoRequest.getNome());
        evento.setDescricao(atualizarEventoRequest.getDescricao());
        evento.setSituacao(atualizarEventoRequest.getSituacao());
        evento.setDataInicio(atualizarEventoRequest.getDataInicio());
        evento.setDataFim(atualizarEventoRequest.getDataFim());
        evento.setLocal(atualizarEventoRequest.getLocal());
        evento.setEndereco(atualizarEventoRequest.getEndereco());
        evento.setNumero(atualizarEventoRequest.getNumero());
        evento.setComplemento(atualizarEventoRequest.getComplemento());
        evento.setCep(atualizarEventoRequest.getCep());
        evento.setBairro(atualizarEventoRequest.getBairro());
        evento.setCidade(atualizarEventoRequest.getCidade());
        evento.setUf(atualizarEventoRequest.getUf());
        evento.setIndGratuito(atualizarEventoRequest.getIndGratuito());
        evento.setIndOnline(atualizarEventoRequest.getIndOnline());
        evento.setIndEnvioTrabalho(atualizarEventoRequest.getIndEnvioTrabalho());
        evento.setEmail(atualizarEventoRequest.getEmail());
        evento.setFoneContato(atualizarEventoRequest.getFoneContato());
        evento.setUrlSite(atualizarEventoRequest.getUrlSite());
        evento.setUrlVideo(atualizarEventoRequest.getUrlVideo());
        evento.setBannerFileName(atualizarEventoRequest.getBannerFileName());
        evento.setBannerFileSize(atualizarEventoRequest.getBannerFileSize());
        evento.setBannerUpdateAt(atualizarEventoRequest.getBannerUpdateAt());
        evento.setLogoFileName(atualizarEventoRequest.getLogoFileName());
        evento.setLogoContentType(atualizarEventoRequest.getLogoContentType());
        evento.setLogoFileSize(atualizarEventoRequest.getLogoFileSize());
        evento.setLogoUpdateAt(atualizarEventoRequest.getLogoUpdateAt());
        evento.setLatitude(atualizarEventoRequest.getLatitude());
        evento.setLongitude(atualizarEventoRequest.getLongitude());
        evento.setGoogleMaps(atualizarEventoRequest.getGoogleMaps());
        evento.setSlug(atualizarEventoRequest.getSlug());

        return evento;

    }

    public AtualizarEventoResponse atualizarEventoResponse(Evento evento) {

        AtualizarEventoResponse atualizarEventoResponse = new AtualizarEventoResponse();

        atualizarEventoResponse.setIdEvento(evento.getIdEvento());
        atualizarEventoResponse.setIdPessoa(evento.getIdPessoa());
        atualizarEventoResponse.setIdTipoEvento(evento.getIdTipoEvento());
        atualizarEventoResponse.setIdEventoPai(evento.getIdEventoPai());
        atualizarEventoResponse.setNome(evento.getNome());
        atualizarEventoResponse.setDescricao(evento.getDescricao());
        atualizarEventoResponse.setSituacao(evento.getSituacao());
        atualizarEventoResponse.setDataInicio(evento.getDataInicio());
        atualizarEventoResponse.setDataFim(evento.getDataFim());
        atualizarEventoResponse.setLocal(evento.getLocal());
        atualizarEventoResponse.setEndereco(evento.getEndereco());
        atualizarEventoResponse.setNumero(evento.getNumero());
        atualizarEventoResponse.setComplemento(evento.getComplemento());
        atualizarEventoResponse.setCep(evento.getCep());
        atualizarEventoResponse.setBairro(evento.getBairro());
        atualizarEventoResponse.setCidade(evento.getCidade());
        atualizarEventoResponse.setUf(evento.getUf());
        atualizarEventoResponse.setIndGratuito(evento.getIndGratuito());
        atualizarEventoResponse.setIndOnline(evento.getIndOnline());
        atualizarEventoResponse.setIndEnvioTrabalho(evento.getIndEnvioTrabalho());
        atualizarEventoResponse.setEmail(evento.getEmail());
        atualizarEventoResponse.setFoneContato(evento.getFoneContato());
        atualizarEventoResponse.setUrlSite(evento.getUrlSite());
        atualizarEventoResponse.setUrlVideo(evento.getUrlVideo());
        atualizarEventoResponse.setBannerFileName(evento.getBannerFileName());
        atualizarEventoResponse.setBannerFileSize(evento.getBannerFileSize());
        atualizarEventoResponse.setBannerUpdateAt(evento.getBannerUpdateAt());
        atualizarEventoResponse.setLogoFileName(evento.getLogoFileName());
        atualizarEventoResponse.setLogoContentType(evento.getLogoContentType());
        atualizarEventoResponse.setLogoFileSize(evento.getLogoFileSize());
        atualizarEventoResponse.setLogoUpdateAt(evento.getLogoUpdateAt());
        atualizarEventoResponse.setLatitude(evento.getLatitude());
        atualizarEventoResponse.setLongitude(evento.getLongitude());
        atualizarEventoResponse.setGoogleMaps(evento.getGoogleMaps());
        atualizarEventoResponse.setSlug(evento.getSlug());

        return atualizarEventoResponse;

    }

    public BuscarEventoResponse buscarEventoResponse(Evento evento) {

        BuscarEventoResponse buscarEventoResponse = new BuscarEventoResponse();

        buscarEventoResponse.setIdEvento(evento.getIdEvento());
        buscarEventoResponse.setIdPessoa(evento.getIdPessoa());
        buscarEventoResponse.setIdTipoEvento(evento.getIdTipoEvento());
        buscarEventoResponse.setIdEventoPai(evento.getIdEventoPai());
        buscarEventoResponse.setNome(evento.getNome());
        buscarEventoResponse.setDescricao(evento.getDescricao());
        buscarEventoResponse.setSituacao(evento.getSituacao());
        buscarEventoResponse.setDataInicio(evento.getDataInicio());
        buscarEventoResponse.setDataFim(evento.getDataFim());
        buscarEventoResponse.setLocal(evento.getLocal());
        buscarEventoResponse.setEndereco(evento.getEndereco());
        buscarEventoResponse.setNumero(evento.getNumero());
        buscarEventoResponse.setComplemento(evento.getComplemento());
        buscarEventoResponse.setCep(evento.getCep());
        buscarEventoResponse.setBairro(evento.getBairro());
        buscarEventoResponse.setCidade(evento.getCidade());
        buscarEventoResponse.setUf(evento.getUf());
        buscarEventoResponse.setIndGratuito(evento.getIndGratuito());
        buscarEventoResponse.setIndOnline(evento.getIndOnline());
        buscarEventoResponse.setIndEnvioTrabalho(evento.getIndEnvioTrabalho());
        buscarEventoResponse.setEmail(evento.getEmail());
        buscarEventoResponse.setFoneContato(evento.getFoneContato());
        buscarEventoResponse.setUrlSite(evento.getUrlSite());
        buscarEventoResponse.setUrlVideo(evento.getUrlVideo());
        buscarEventoResponse.setBannerFileName(evento.getBannerFileName());
        buscarEventoResponse.setBannerFileSize(evento.getBannerFileSize());
        buscarEventoResponse.setBannerUpdateAt(evento.getBannerUpdateAt());
        buscarEventoResponse.setLogoFileName(evento.getLogoFileName());
        buscarEventoResponse.setLogoContentType(evento.getLogoContentType());
        buscarEventoResponse.setLogoFileSize(evento.getLogoFileSize());
        buscarEventoResponse.setLogoUpdateAt(evento.getLogoUpdateAt());
        buscarEventoResponse.setLatitude(evento.getLatitude());
        buscarEventoResponse.setLongitude(evento.getLongitude());
        buscarEventoResponse.setGoogleMaps(evento.getGoogleMaps());
        buscarEventoResponse.setSlug(evento.getSlug());

        return buscarEventoResponse;
    }

    public List<ListarEventosResponse> listarEventosResponse(List<Evento> eventos) {
        List<ListarEventosResponse> listarEventosResponse = new ArrayList<ListarEventosResponse>();

        for (Evento evento : eventos) {
            ListarEventosResponse response = new ListarEventosResponse();

            response.setIdEvento(evento.getIdEvento());
            response.setIdPessoa(evento.getIdPessoa());
            response.setIdTipoEvento(evento.getIdTipoEvento());
            response.setIdEventoPai(evento.getIdEventoPai());
            response.setNome(evento.getNome());
            response.setDescricao(evento.getDescricao());
            response.setSituacao(evento.getSituacao());
            response.setDataInicio(evento.getDataInicio());
            response.setDataFim(evento.getDataFim());
            response.setLocal(evento.getLocal());
            response.setEndereco(evento.getEndereco());
            response.setNumero(evento.getNumero());
            response.setComplemento(evento.getComplemento());
            response.setCep(evento.getCep());
            response.setBairro(evento.getBairro());
            response.setCidade(evento.getCidade());
            response.setUf(evento.getUf());
            response.setIndGratuito(evento.getIndGratuito());
            response.setIndOnline(evento.getIndOnline());
            response.setIndEnvioTrabalho(evento.getIndEnvioTrabalho());
            response.setEmail(evento.getEmail());
            response.setFoneContato(evento.getFoneContato());
            response.setUrlSite(evento.getUrlSite());
            response.setUrlVideo(evento.getUrlVideo());
            response.setBannerFileName(evento.getBannerFileName());
            response.setBannerFileSize(evento.getBannerFileSize());
            response.setBannerUpdateAt(evento.getBannerUpdateAt());
            response.setLogoFileName(evento.getLogoFileName());
            response.setLogoContentType(evento.getLogoContentType());
            response.setLogoFileSize(evento.getLogoFileSize());
            response.setLogoUpdateAt(evento.getLogoUpdateAt());
            response.setLatitude(evento.getLatitude());
            response.setLongitude(evento.getLongitude());
            response.setGoogleMaps(evento.getGoogleMaps());
            response.setSlug(evento.getSlug());

            listarEventosResponse.add(response);
        }
        return listarEventosResponse;
    }

    public Evento deletarEventoRequest(DeletarEventoRequest deletarEventoRequest) {

        Evento evento = new Evento();

        evento.setIdEvento(deletarEventoRequest.getIdEvento());

        return evento;

    }
}
