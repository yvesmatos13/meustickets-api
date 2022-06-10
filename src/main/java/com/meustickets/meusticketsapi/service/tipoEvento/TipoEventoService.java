package com.meustickets.meusticketsapi.service.tipoEvento;

import java.util.List;

import com.meustickets.meusticketsapi.webApi.model.tipoEvento.BuscarTipoEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.tipoEvento.ListarTipoEventosResponse;

public interface TipoEventoService {

    List<ListarTipoEventosResponse> listarTipoEventos();
    
    BuscarTipoEventoResponse buscarTipoEvento(Long idTipoEvento);

    
}
