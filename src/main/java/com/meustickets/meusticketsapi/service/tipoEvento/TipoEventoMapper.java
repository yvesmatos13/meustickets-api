package com.meustickets.meusticketsapi.service.tipoEvento;

import java.util.ArrayList;
import java.util.List;

import com.meustickets.meusticketsapi.persistence.entity.TipoEvento;
import com.meustickets.meusticketsapi.webApi.model.tipoEvento.BuscarTipoEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.tipoEvento.ListarTipoEventosResponse;

public class TipoEventoMapper {

    public BuscarTipoEventoResponse buscarTipoEventoResponse(TipoEvento tipoEvento) {

        BuscarTipoEventoResponse buscarTipoEventoResponse = new BuscarTipoEventoResponse();

        buscarTipoEventoResponse.setIdTipoEvento(tipoEvento.getIdTipoEvento());
        buscarTipoEventoResponse.setDescricao(tipoEvento.getDescricao());
        buscarTipoEventoResponse.setSlug(tipoEvento.getSlug());

        return buscarTipoEventoResponse;
    }

    public List<ListarTipoEventosResponse> listarEventosResponse(List<TipoEvento> tipoEventos) {
        List<ListarTipoEventosResponse> listarTipoEventoResponses = new ArrayList<ListarTipoEventosResponse>();

        for (TipoEvento tipoEvento : tipoEventos) {
            ListarTipoEventosResponse response = new ListarTipoEventosResponse();

            response.setIdTipoEvento(tipoEvento.getIdTipoEvento());
            response.setDescricao(tipoEvento.getDescricao());
            response.setSlug(tipoEvento.getSlug());

            listarTipoEventoResponses.add(response);
        }
        return listarTipoEventoResponses;
    }

}
