package com.meustickets.meusticketsapi.service.tipoEvento;

import java.util.List;

import javax.transaction.Transactional;

import com.meustickets.meusticketsapi.exception.BusinessException;
import com.meustickets.meusticketsapi.persistence.repository.TipoEventoRepository;
import com.meustickets.meusticketsapi.webApi.model.tipoEvento.BuscarTipoEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.tipoEvento.ListarTipoEventosResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Transactional
@Service
public class TipoEventoServiceImpl implements TipoEventoService {

    @Autowired
    private TipoEventoRepository tipoEventoRepository;

    private TipoEventoMapper tipoEventoMapeamento = new TipoEventoMapper();

    @Override
    public List<ListarTipoEventosResponse> listarTipoEventos() {
        return tipoEventoMapeamento.listarEventosResponse(tipoEventoRepository.findAll());
    }

    @Override
    public BuscarTipoEventoResponse buscarTipoEvento(Long idTipoEvento) {
        
        return tipoEventoMapeamento
                .buscarTipoEventoResponse(tipoEventoRepository
                        .findByIdTipoEvento(idTipoEvento).orElseThrow( 
                            () -> new BusinessException("idTipoEvento não encontrado")));
    }

}
