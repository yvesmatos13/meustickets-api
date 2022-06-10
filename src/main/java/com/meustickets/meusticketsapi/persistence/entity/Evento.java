package com.meustickets.meusticketsapi.persistence.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "eventos")
public class Evento extends AbstractAuditEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, name = "id_evento")
    private Long idEvento;

    @ManyToOne
    @JoinColumn(name = "id_pessoa", nullable = false)
    private Pessoa pessoa;

    @Column(name = "id_tipo_evento", nullable = false)
    private Long idTipoEvento;

    @Column(name = "id_evento_pai", nullable = true)
    private Long idEventoPai;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "descricao", nullable = false)
    private String descricao;

    @Column(name = "situacao", nullable = false)
    private Long situacao;

    @Column(name = "data_inicio", nullable = true)
    private Date dataInicio;

    @Column(name = "data_fim", nullable = true)
    private Date dataFim;

    @Column(name = "hora_inicio", nullable = true)
    private String horaInicio;

    @Column(name = "hora_fim", nullable = true)
    private String horaFim;

    @Column(name = "local", nullable = true)
    private String local;

    @Column(name = "endereco", nullable = true)
    private String endereco;

    @Column(name = "numero", nullable = true)
    private String numero;

    @Column(name = "complemento", nullable = true)
    private String complemento;

    @Column(name = "cep", nullable = true)
    private String cep;

    @Column(name = "bairro", nullable = true)
    private String bairro;

    @Column(name = "cidade", nullable = true)
    private String cidade;

    @Column(name = "uf", nullable = true)
    private String uf;

    @Column(name = "ind_gratuito", nullable = true)
    private String indGratuito;

    @Column(name = "ind_online", nullable = true)
    private String indOnline;

    @Column(name = "ind_envio_trabalho", nullable = true)
    private String indEnvioTrabalho;

    @Column(name = "email", nullable = true)
    private String email;

    @Column(name = "fone_contato", nullable = true)
    private String foneContato;

    @Column(name = "celular_contato", nullable = true)
    private String celularContato;

    @Column(name = "url_site", nullable = true)
    private String urlSite;

    @Column(name = "url_video", nullable = true)
    private String urlVideo;

    @Column(name = "banner_file_name", nullable = true)
    private String bannerFileName;

    @Column(name = "banner_content_type", nullable = true)
    private String bannerContentType;

    @Column(name = "banner_file_size", nullable = true)
    private String bannerFileSize;

    @Column(name = "banner_update_at", nullable = true)
    private Date bannerUpdateAt;

    @Column(name = "logo_file_name", nullable = true)
    private String logoFileName;

    @Column(name = "logo_content_type", nullable = true)
    private String logoContentType;

    @Column(name = "logo_file_size", nullable = true)
    private Long logoFileSize;

    @Column(name = "logo_update_at", nullable = true)
    private Date logoUpdateAt;

    @Column(name = "latitude", nullable = true)
    private Double latitude;

    @Column(name = "Longitude", nullable = true)
    private Double Longitude;

    @Column(name = "google_maps", nullable = true)
    private String googleMaps;

    @Column(name = "slug", nullable = true)
    private String slug;

    public Long getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(Long idEvento) {
        this.idEvento = idEvento;
    }

    public Long getIdPessoa() {
        return pessoa.getIdPessoa();
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
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
