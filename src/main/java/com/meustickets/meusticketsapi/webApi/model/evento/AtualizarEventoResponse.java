package com.meustickets.meusticketsapi.webApi.model.evento;

import java.util.Date;

import io.swagger.annotations.ApiModelProperty;

public class AtualizarEventoResponse {

    @ApiModelProperty(position = 0, required = true, hidden = false)
    private Long idEvento;

    @ApiModelProperty(position = 1, required = true)
    private Long idPessoa;

    @ApiModelProperty(position = 2, required = true)
    private Long idTipoEvento;

    @ApiModelProperty(position = 3, required = false)
    private Long idEventoPai;

    @ApiModelProperty(position = 4, required = true)
    private String nome;

    @ApiModelProperty(position = 5, required = true)
    private String descricao;

    @ApiModelProperty(position = 6, required = true)
    private Long situacao;

    @ApiModelProperty(position = 7, required = false)
    private Date dataInicio;

    @ApiModelProperty(position = 8, required = false)
    private Date dataFim;

    @ApiModelProperty(position = 9, required = false)
    private String horaInicio;

    @ApiModelProperty(position = 10, required = false)
    private String horaFim;

    @ApiModelProperty(position = 11, required = false)
    private String local;

    @ApiModelProperty(position = 12, required = false)
    private String endereco;

    @ApiModelProperty(position = 13, required = false)
    private String numero;

    @ApiModelProperty(position = 14, required = false)
    private String complemento;

    @ApiModelProperty(position = 15, required = false)
    private String cep;

    @ApiModelProperty(position = 16, required = false)
    private String bairro;

    @ApiModelProperty(position = 17, required = false)
    private String cidade;

    @ApiModelProperty(position = 18, required = false)
    private String uf;

    @ApiModelProperty(position = 19, required = false)
    private String indGratuito;

    @ApiModelProperty(position = 20, required = false)
    private String indOnline;

    @ApiModelProperty(position = 21, required = false)
    private String indEnvioTrabalho;

    @ApiModelProperty(position = 22, required = false)
    private String email;

    @ApiModelProperty(position = 23, required = false)
    private String foneContato;

    @ApiModelProperty(position = 24, required = false)
    private String celularContato;

    @ApiModelProperty(position = 25, required = false)
    private String urlSite;

    @ApiModelProperty(position = 26, required = false)
    private String urlVideo;

    @ApiModelProperty(position = 27, required = false)
    private String bannerFileName;

    @ApiModelProperty(position = 28, required = false)
    private String bannerContentType;

    @ApiModelProperty(position = 29, required = false)
    private String bannerFileSize;

    @ApiModelProperty(position = 30, required = false)
    private Date bannerUpdateAt;

    @ApiModelProperty(position = 31, required = false)
    private String logoFileName;

    @ApiModelProperty(position = 32, required = false)
    private String logoContentType;

    @ApiModelProperty(position = 33, required = false)
    private Long logoFileSize;

    @ApiModelProperty(position = 34, required = false)
    private Date logoUpdateAt;

    @ApiModelProperty(position = 35, required = false)
    private Double latitude;

    @ApiModelProperty(position = 36, required = false)
    private Double Longitude;

    @ApiModelProperty(position = 37, required = false)
    private String googleMaps;

    @ApiModelProperty(position = 38, required = false)
    private String slug;

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public Long getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Long idPessoa) {
        this.idPessoa = idPessoa;
    }

    public Long getIdTipoEvento() {
        return idTipoEvento;
    }

    public void setIdTipoEvento(Long idTipoEvento) {
        this.idTipoEvento = idTipoEvento;
    }

    public Long getIdEventoPai() {
        return idEventoPai;
    }

    public void setIdEventoPai(Long idEventoPai) {
        this.idEventoPai = idEventoPai;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Long getSituacao() {
        return situacao;
    }

    public void setSituacao(Long situacao) {
        this.situacao = situacao;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFim() {
        return horaFim;
    }

    public void setHoraFim(String horaFim) {
        this.horaFim = horaFim;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getIndGratuito() {
        return indGratuito;
    }

    public void setIndGratuito(String indGratuito) {
        this.indGratuito = indGratuito;
    }

    public String getIndOnline() {
        return indOnline;
    }

    public void setIndOnline(String indOnline) {
        this.indOnline = indOnline;
    }

    public String getIndEnvioTrabalho() {
        return indEnvioTrabalho;
    }

    public void setIndEnvioTrabalho(String indEnvioTrabalho) {
        this.indEnvioTrabalho = indEnvioTrabalho;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFoneContato() {
        return foneContato;
    }

    public void setFoneContato(String foneContato) {
        this.foneContato = foneContato;
    }

    public String getCelularContato() {
        return celularContato;
    }

    public void setCelularContato(String celularContato) {
        this.celularContato = celularContato;
    }

    public String getUrlSite() {
        return urlSite;
    }

    public void setUrlSite(String urlSite) {
        this.urlSite = urlSite;
    }

    public String getUrlVideo() {
        return urlVideo;
    }

    public void setUrlVideo(String urlVideo) {
        this.urlVideo = urlVideo;
    }

    public String getBannerFileName() {
        return bannerFileName;
    }

    public void setBannerFileName(String bannerFileName) {
        this.bannerFileName = bannerFileName;
    }

    public String getBannerContentType() {
        return bannerContentType;
    }

    public void setBannerContentType(String bannerContentType) {
        this.bannerContentType = bannerContentType;
    }

    public String getBannerFileSize() {
        return bannerFileSize;
    }

    public void setBannerFileSize(String bannerFileSize) {
        this.bannerFileSize = bannerFileSize;
    }

    public Date getBannerUpdateAt() {
        return bannerUpdateAt;
    }

    public void setBannerUpdateAt(Date bannerUpdateAt) {
        this.bannerUpdateAt = bannerUpdateAt;
    }

    public String getLogoFileName() {
        return logoFileName;
    }

    public void setLogoFileName(String logoFileName) {
        this.logoFileName = logoFileName;
    }

    public String getLogoContentType() {
        return logoContentType;
    }

    public void setLogoContentType(String logoContentType) {
        this.logoContentType = logoContentType;
    }

    public Long getLogoFileSize() {
        return logoFileSize;
    }

    public void setLogoFileSize(Long logoFileSize) {
        this.logoFileSize = logoFileSize;
    }

    public Date getLogoUpdateAt() {
        return logoUpdateAt;
    }

    public void setLogoUpdateAt(Date logoUpdateAt) {
        this.logoUpdateAt = logoUpdateAt;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return Longitude;
    }

    public void setLongitude(Double Longitude) {
        this.Longitude = Longitude;
    }

    public String getGoogleMaps() {
        return googleMaps;
    }

    public void setGoogleMaps(String googleMaps) {
        this.googleMaps = googleMaps;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    
}
