package com.meustickets.meusticketsapi.webApi.model.evento;

import io.swagger.annotations.ApiModelProperty;

public class DeletarEventoRequest {

    @ApiModelProperty(position = 0, required = true)
    private Long idEvento;

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }
    
}
