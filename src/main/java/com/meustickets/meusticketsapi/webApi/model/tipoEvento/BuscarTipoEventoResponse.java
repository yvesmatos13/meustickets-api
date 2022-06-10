package com.meustickets.meusticketsapi.webApi.model.tipoEvento;

import io.swagger.annotations.ApiModelProperty;

public class BuscarTipoEventoResponse {
    
    @ApiModelProperty(position = 0, required = false)
    private Long idTipoEvento;

    @ApiModelProperty(position = 1, required = false)
    private String descricao;

    @ApiModelProperty(position = 2, required = false)
    private String slug;

    public Long getIdTipoEvento() {
        return idTipoEvento;
    }

    public void setIdTipoEvento(Long idTipoEvento) {
        this.idTipoEvento = idTipoEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }
}
