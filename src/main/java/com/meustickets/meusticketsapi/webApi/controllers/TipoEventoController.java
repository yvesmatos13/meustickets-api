package com.meustickets.meusticketsapi.webApi.controllers;

import java.util.List;

import com.meustickets.meusticketsapi.service.tipoEvento.TipoEventoServiceImpl;
import com.meustickets.meusticketsapi.webApi.model.tipoEvento.BuscarTipoEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.tipoEvento.ListarTipoEventosResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Tipo", tags = "TipoEvento", description = " ")
public class TipoEventoController {

    @Autowired
    private TipoEventoServiceImpl tipoEventoServico;

    @ApiOperation(value = "Retorna uma lista de Tipos")
    @GetMapping(value = "/tipoEventos")
    @ResponseStatus(HttpStatus.OK)
    public List<ListarTipoEventosResponse> listarTipoEventos() {
        return tipoEventoServico.listarTipoEventos();
    }

    @ApiOperation(value = "Retorna um Tipo")
    @GetMapping(value = "/tipoEvento/{idTipoEvento}")
    public BuscarTipoEventoResponse buscarTipoEvento(@PathVariable(value = "idTipoEvento") Long idTipoEvento) {
        return tipoEventoServico.buscarTipoEvento(idTipoEvento);
    }

}