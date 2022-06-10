package com.meustickets.meusticketsapi.persistence.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name = "pessoas")
public class Pessoa extends AbstractAuditEntity {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pessoa", nullable = false)
    private Long idPessoa;

    @Column(name = "nome", nullable = false)
    private String nome;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password_digest", nullable = false)
    private String password;

    @Column(name = "tipo_pessoa", nullable = true)
    private String tipoPessoa;

    @Column(name = "cpf_cnpj", nullable = true)
    private String cpfCnpj;

    @Column(name = "ind_aceita_termos", nullable = false)
    private String indAceitaTermos;

    @Column(name = "ind_envio_email", nullable = true)
    private String indEnvioEmail;

    @Column(name = "perfil", nullable = true)
    private Long perfil;

    @Column(name = "sexo", nullable = true)
    private String sexo;

    @Column(name = "data_nascimento", nullable = true)
    private Date dataNascimento;

    @Column(name = "avatar_file_name", nullable = true)
    private String avatarFileName;

    @Column(name = "avatar_content_type", nullable = true)
    private String avatarContentType;

    @Column(name = "avatar_file_size", nullable = true)
    private Long avatarFileSize;

    @Column(name = "avatar_updated_at", nullable = true)
    private Date avatarUpdatedAt;

    @Column(name = "slug", nullable = true)
    private String slug;

    @OneToMany(mappedBy = "pessoa")
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Evento> eventos;

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

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    

}
