package com.meustickets.meusticketsapi.webApi.model.pessoa;

import io.swagger.annotations.ApiModelProperty;

public class DeletarPessoaRequest {

    @ApiModelProperty(position = 0, required = true)
    private Long idPessoa;

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

}
