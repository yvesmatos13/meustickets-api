package com.meustickets.meustickets.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "eventos")
@EntityListeners(AuditingEntityListener.class)
public class Evento implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_evento")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_pessoa")
    private Pessoa pessoa;

    @ManyToOne
    @JoinColumn(name = "id_assunto")
    private Assunto assunto;

    @ManyToOne
    @JoinColumn(name = "id_categoria")
    private Categoria categoria;

    private String nome;

    @Lob
    private byte[] imagem;

    @Column(name = "data_inicio", length = 10)
    private String dataInicio;

    @Column(name = "hora_inicio", length = 5)
    private String horaInicio;

    @Column(name = "data_fim", length = 10)
    private String dataFim;

    @Column(name = "hora_fim", length = 5)
    private String horaFim;

    @Lob
    private String descricao;

    @Column(name = "local_definido")
    private Boolean localDefinido;

    private String mapa;

    @Column(name = "mostrar_mapa")
    private Boolean mostrarMapa;

    @Column(name = "nome_local")
    private String nomeLocal;

    private String cep;
    private String endereco;
    private String numero;
    private String complemento;
    private String bairro;
    private String cidade;
    private String uf;

    @Column(name = "produtor_nome")
    private String produtorNome;

    @Column(name = "produtor_descricao", columnDefinition = "TEXT")
    private String produtorDescricao;

    @Column(name = "aceito_termos")
    private Boolean aceitoTermos;

    @Column(name = "aceito_diretrizes")
    private Boolean aceitoDiretrizes;

    @Column(name = "aceito_regras_meia_entrada")
    private Boolean aceitoRegrasMeiaEntrada;

    @Column(name = "aceito_politicas_privacidade")
    private Boolean aceitoPoliticasPrivacidade;

    @Column(name = "aceito_obrigatoriedades_legais")
    private Boolean aceitoObrigatoriedadesLegais;

    @Column(name = "visibilidade_evento")
    private Boolean visibilidadeEvento;

    @Column(name = "publicar_evento")
    private Boolean publicarEvento;

    @Column(name = "created_at", updatable = false, insertable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Pessoa getPessoa() {
		return pessoa;
	}

	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}

	public Assunto getAssunto() {
		return assunto;
	}

	public void setAssunto(Assunto assunto) {
		this.assunto = assunto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public byte[] getImagem() {
		return imagem;
	}

	public void setImagem(byte[] imagem) {
		this.imagem = imagem;
	}

	public String getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(String dataInicio) {
		this.dataInicio = dataInicio;
	}

	public String getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(String horaInicio) {
		this.horaInicio = horaInicio;
	}

	public String getDataFim() {
		return dataFim;
	}

	public void setDataFim(String dataFim) {
		this.dataFim = dataFim;
	}

	public String getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(String horaFim) {
		this.horaFim = horaFim;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Boolean getLocalDefinido() {
		return localDefinido;
	}

	public void setLocalDefinido(Boolean localDefinido) {
		this.localDefinido = localDefinido;
	}

	public String getMapa() {
		return mapa;
	}

	public void setMapa(String mapa) {
		this.mapa = mapa;
	}

	public Boolean getMostrarMapa() {
		return mostrarMapa;
	}

	public void setMostrarMapa(Boolean mostrarMapa) {
		this.mostrarMapa = mostrarMapa;
	}

	public String getNomeLocal() {
		return nomeLocal;
	}

	public void setNomeLocal(String nomeLocal) {
		this.nomeLocal = nomeLocal;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
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

	public String getProdutorNome() {
		return produtorNome;
	}

	public void setProdutorNome(String produtorNome) {
		this.produtorNome = produtorNome;
	}

	public String getProdutorDescricao() {
		return produtorDescricao;
	}

	public void setProdutorDescricao(String produtorDescricao) {
		this.produtorDescricao = produtorDescricao;
	}

	public Boolean getAceitoTermos() {
		return aceitoTermos;
	}

	public void setAceitoTermos(Boolean aceitoTermos) {
		this.aceitoTermos = aceitoTermos;
	}

	public Boolean getAceitoDiretrizes() {
		return aceitoDiretrizes;
	}

	public void setAceitoDiretrizes(Boolean aceitoDiretrizes) {
		this.aceitoDiretrizes = aceitoDiretrizes;
	}

	public Boolean getAceitoRegrasMeiaEntrada() {
		return aceitoRegrasMeiaEntrada;
	}

	public void setAceitoRegrasMeiaEntrada(Boolean aceitoRegrasMeiaEntrada) {
		this.aceitoRegrasMeiaEntrada = aceitoRegrasMeiaEntrada;
	}

	public Boolean getAceitoPoliticasPrivacidade() {
		return aceitoPoliticasPrivacidade;
	}

	public void setAceitoPoliticasPrivacidade(Boolean aceitoPoliticasPrivacidade) {
		this.aceitoPoliticasPrivacidade = aceitoPoliticasPrivacidade;
	}

	public Boolean getAceitoObrigatoriedadesLegais() {
		return aceitoObrigatoriedadesLegais;
	}

	public void setAceitoObrigatoriedadesLegais(Boolean aceitoObrigatoriedadesLegais) {
		this.aceitoObrigatoriedadesLegais = aceitoObrigatoriedadesLegais;
	}

	public Boolean getVisibilidadeEvento() {
		return visibilidadeEvento;
	}

	public void setVisibilidadeEvento(Boolean visibilidadeEvento) {
		this.visibilidadeEvento = visibilidadeEvento;
	}

	public Boolean getPublicarEvento() {
		return publicarEvento;
	}

	public void setPublicarEvento(Boolean publicarEvento) {
		this.publicarEvento = publicarEvento;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

}
