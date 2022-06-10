package com.meustickets.meusticketsapi.webApi.controllers;

import java.util.List;

import com.meustickets.meusticketsapi.service.evento.EventoServiceImpl;
import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.AtualizarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.BuscarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.CadastrarEventoResponse;
import com.meustickets.meusticketsapi.webApi.model.evento.DeletarEventoRequest;
import com.meustickets.meusticketsapi.webApi.model.evento.ListarEventosResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin("*")
@RestController
@RequestMapping(value = "/api")
@Api(value = "API REST Evento", tags = "Evento", description = " ")
public class EventoController {

    @Autowired
    private EventoServiceImpl eventoServico;

    @ApiOperation(value = "Retorna uma lista de eventos")
    @GetMapping(value = "/eventos")
    public List<ListarEventosResponse> listarEventos() {
        return eventoServico.listarEvento();
    }

    @ApiOperation(value = "Retorna um evento")
    @GetMapping(value = "/evento/{idEvento}")
    public BuscarEventoResponse buscarEvento(@PathVariable(value = "idEvento") Long idEvento) {
        return eventoServico.buscarEvento(idEvento);
    }

    @ApiOperation(value = "Cadastra nova evento")
    @PostMapping(value = "/evento")
    public CadastrarEventoResponse cadastrarEvento(@RequestBody CadastrarEventoRequest cadastrarEventoRequest) {
        return eventoServico.cadastrarEvento(cadastrarEventoRequest);
    }

    @ApiOperation(value = "Atualiza evento")
    @PutMapping(value = "/evento")
    public AtualizarEventoResponse atualizarEvento(@RequestBody AtualizarEventoRequest atualizarEventoRequest) {
        return eventoServico.atualizarEvento(atualizarEventoRequest);
    }

    @ApiOperation(value = "Deleta evento")
    @DeleteMapping(value = "evento")
    public void deletarEvento(@RequestBody DeletarEventoRequest deletarEventoRequest) {
        eventoServico.deletarEvento(deletarEventoRequest);
    }

}
