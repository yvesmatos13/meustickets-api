package com.meustickets.meusticketsapi.service.evento;

import java.util.List;

import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.BuscarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.DeletarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.ListarEventosResponse;

public interface EventoService {

    List<ListarEventosResponse> listarEvento();
    
    CadastrarEventoResponse cadastrarEvento(CadastrarEventoRequest cadastrarEventoRequest);

    AtualizarEventoResponse atualizarEvento(AtualizarEventoRequest atualizarEventoRequest);

    BuscarEventoResponse buscarEvento(Long idEvento);

    void deletarEvento(DeletarEventoRequest deletarEventoRequest);
    
}
