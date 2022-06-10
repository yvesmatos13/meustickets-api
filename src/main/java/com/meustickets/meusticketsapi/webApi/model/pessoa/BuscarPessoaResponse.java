package com.meustickets.meusticketsapi.webApi.model.pessoa;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class BuscarPessoaResponse {

    @ApiModelProperty(position = 0, hidden = false)
    private Long idPessoa;

    @ApiModelProperty(position = 1, required = true)
    private String nome;

    @ApiModelProperty(position = 2, required = true)
    private String email;

    @ApiModelProperty(position = 3, required = true)
    private String password;

    @ApiModelProperty(position = 4, required = false)
    private String tipoPessoa;

    @ApiModelProperty(position = 5, required = false)
    private String cpfCnpj;

    @ApiModelProperty(position = 6, required = true)
    private String indAceitaTermos;

    @ApiModelProperty(position = 7, required = false)
    private String indEnvioEmail;

    @ApiModelProperty(position = 8, required = false)
    private Long perfil;

    @ApiModelProperty(position = 9, required = false)
    private String sexo;

    @ApiModelProperty(position = 10, required = false)
    private Date dataNascimento;

    @ApiModelProperty(position = 11, required = false)
    private String avatarFileName;

    @ApiModelProperty(position = 12, required = false)
    private String avatarContentType;

    @ApiModelProperty(position = 13, required = false)
    private Long avatarFileSize;

    @ApiModelProperty(position = 14, required = false)
    private Date avatarUpdatedAt;

    @ApiModelProperty(position = 15, required = false)
    private String slug;

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public String getIndAceitaTermos() {
        return indAceitaTermos;
    }

    public void setIndAceitaTermos(String indAceitaTermos) {
        this.indAceitaTermos = indAceitaTermos;
    }

    public String getIndEnvioEmail() {
        return indEnvioEmail;
    }

    public void setIndEnvioEmail(String indEnvioEmail) {
        this.indEnvioEmail = indEnvioEmail;
    }

    public Long getPerfil() {
        return perfil;
    }

    public void setPerfil(Long perfil) {
        this.perfil = perfil;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getAvatarFileName() {
        return avatarFileName;
    }

    public void setAvatarFileName(String avatarFileName) {
        this.avatarFileName = avatarFileName;
    }

    public String getAvatarContentType() {
        return avatarContentType;
    }

    public void setAvatarContentType(String avatarContentType) {
        this.avatarContentType = avatarContentType;
    }

    public Long getAvatarFileSize() {
        return avatarFileSize;
    }

    public void setAvatarFileSize(Long avatarFileSize) {
        this.avatarFileSize = avatarFileSize;
    }

    public Date getAvatarUpdatedAt() {
        return avatarUpdatedAt;
    }

    public void setAvatarUpdatedAt(Date avatarUpdatedAt) {
        this.avatarUpdatedAt = avatarUpdatedAt;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

}
