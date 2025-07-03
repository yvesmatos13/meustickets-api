package com.meustickets.meustickets.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "ingressos")
@EntityListeners(AuditingEntityListener.class)
public class Ingresso implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_ingresso")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_evento")
    private Evento evento;

    @ManyToOne
    @JoinColumn(name = "id_lote")
    private Lote lote;

    @ManyToOne
    @JoinColumn(name = "id_nomenclatura_ingresso")
    private NomenclaturaIngresso nomenclaturaIngresso;

    @Column(length = 255)
    private String nome;

    @Lob
    private String descricao;

    private Integer quantidade;

    @Column(precision = 10, scale = 0)
    private BigDecimal valor;

    @Column(name = "valor_comprador", precision = 10, scale = 0)
    private BigDecimal valorComprador;

    @Column(name = "data_inicio_vendas", length = 10)
    private String dataInicioVendas;

    @Column(name = "hora_inicio_vendas", length = 5)
    private String horaInicioVendas;

    @Column(name = "data_fim_vendas", length = 10)
    private String dataFimVendas;

    @Column(name = "hora_fim_vendas", length = 5)
    private String horaFimVendas;

    @Column(name = "quantidade_minima_permitida")
    private Integer quantidadeMinimaPermitida;

    @Column(name = "quantidade_maxima_permitida")
    private Integer quantidadeMaximaPermitida;

    @Column(name = "visibilidade_ingresso")
    private Boolean visibilidadeIngresso;

    @Column(name = "created_at", updatable = false, insertable = false)
    private LocalDateTime createdAt;

    @Column(name = "updated_at", insertable = false)
    private LocalDateTime updatedAt;

    // Getters e Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Lote getLote() {
        return lote;
    }

    public void setLote(Lote lote) {
        this.lote = lote;
    }

    public NomenclaturaIngresso getNomenclaturaIngresso() {
        return nomenclaturaIngresso;
    }

    public void setNomenclaturaIngresso(NomenclaturaIngresso nomenclaturaIngresso) {
        this.nomenclaturaIngresso = nomenclaturaIngresso;
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

    public Integer getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public BigDecimal getValorComprador() {
        return valorComprador;
    }

    public void setValorComprador(BigDecimal valorComprador) {
        this.valorComprador = valorComprador;
    }

    public String getDataInicioVendas() {
        return dataInicioVendas;
    }

    public void setDataInicioVendas(String dataInicioVendas) {
        this.dataInicioVendas = dataInicioVendas;
    }

    public String getHoraInicioVendas() {
        return horaInicioVendas;
    }

    public void setHoraInicioVendas(String horaInicioVendas) {
        this.horaInicioVendas = horaInicioVendas;
    }

    public String getDataFimVendas() {
        return dataFimVendas;
    }

    public void setDataFimVendas(String dataFimVendas) {
        this.dataFimVendas = dataFimVendas;
    }

    public String getHoraFimVendas() {
        return horaFimVendas;
    }

    public void setHoraFimVendas(String horaFimVendas) {
        this.horaFimVendas = horaFimVendas;
    }

    public Integer getQuantidadeMinimaPermitida() {
        return quantidadeMinimaPermitida;
    }

    public void setQuantidadeMinimaPermitida(Integer quantidadeMinimaPermitida) {
        this.quantidadeMinimaPermitida = quantidadeMinimaPermitida;
    }

    public Integer getQuantidadeMaximaPermitida() {
        return quantidadeMaximaPermitida;
    }

    public void setQuantidadeMaximaPermitida(Integer quantidadeMaximaPermitida) {
        this.quantidadeMaximaPermitida = quantidadeMaximaPermitida;
    }

    public Boolean getVisibilidadeIngresso() {
        return visibilidadeIngresso;
    }

    public void setVisibilidadeIngresso(Boolean visibilidadeIngresso) {
        this.visibilidadeIngresso = visibilidadeIngresso;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }
}
