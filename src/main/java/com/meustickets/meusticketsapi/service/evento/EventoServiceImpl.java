package com.meustickets.meusticketsapi.service.evento;

import java.util.List;

import javax.transaction.Transactional;

import com.meustickets.meusticketsapi.persistence.entity.Pessoa;
import com.meustickets.meusticketsapi.persistence.repository.EventoRepository;
import com.meustickets.meusticketsapi.persistence.repository.PessoaRepository;
import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.BuscarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.DeletarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.ListarEventosResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class EventoServiceImpl implements EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    @Autowired
    private PessoaRepository pessoaRepository;

    private EventoMapper eventoMapeamento = new EventoMapper();

    @Override
    public List<ListarEventosResponse> listarEvento() {
        return eventoMapeamento.listarEventosResponse(eventoRepository.findAll());
    }

    @Override
    public CadastrarEventoResponse cadastrarEvento(CadastrarEventoRequest cadastrarEventoRequest) {
        Pessoa pessoa = new Pessoa();
        pessoa = pessoaRepository.findByIdPessoa(cadastrarEventoRequest.getIdPessoa()).get();
        return eventoMapeamento.cadastrarEventoResponse(eventoRepository
                .save(eventoMapeamento
                        .cadastrarEventoRequest(cadastrarEventoRequest, pessoa)));

    }

    @Override
    public AtualizarEventoResponse atualizarEvento(AtualizarEventoRequest atualizarEventoRequest) {
        Pessoa pessoa = new Pessoa();
        pessoa = pessoaRepository.findByIdPessoa(atualizarEventoRequest.getIdPessoa()).get();
        return eventoMapeamento.atualizarEventoResponse(eventoRepository
                .save(eventoMapeamento
                        .atualizarEventoRequest(atualizarEventoRequest, pessoa)));

    }

    @Override
    public BuscarEventoResponse buscarEvento(Long idEvento) {
        return eventoMapeamento.buscarEventoResponse(eventoRepository.findByIdEvento(idEvento).get());
    }

    @Override
    public void deletarEvento(DeletarEventoRequest deletarEventoRequest) {
        eventoRepository.delete(eventoMapeamento.deletarEventoRequest(deletarEventoRequest));
    }

}
