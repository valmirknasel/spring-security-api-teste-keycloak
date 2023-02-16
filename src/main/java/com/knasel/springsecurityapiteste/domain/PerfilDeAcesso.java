package com.knasel.springsecurityapiteste.domain;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity(name = "tb_perfil_de_acesso")
public class PerfilDeAcesso implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "perfil_sequence")
    @SequenceGenerator(name = "perfil_sequence", sequenceName = "perfil_seq", allocationSize = 1)
    private Long idPerfil;

    @Column(name = "nome_perfil")
    private String nomeDoPerfil;
    private String descricao;

    public Long getId() {
        return idPerfil;
    }

    public void setId(Long id) {
        this.idPerfil = id;
    }

    public String getNomeDoPerfil() {
        return nomeDoPerfil;
    }

    public void setNomeDoPerfil(String nomeDoPerfil) {
        this.nomeDoPerfil = nomeDoPerfil;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
