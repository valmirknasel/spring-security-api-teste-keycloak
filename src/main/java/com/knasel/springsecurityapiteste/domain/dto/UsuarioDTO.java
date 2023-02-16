package com.knasel.springsecurityapiteste.domain.dto;

import com.knasel.springsecurityapiteste.domain.PerfilDeAcesso;
import com.knasel.springsecurityapiteste.domain.Usuario;
import jakarta.validation.Valid;

import java.util.List;

public class UsuarioDTO {

    private Long id;
    private List<PerfilDeAcesso> authorities;
    private String username;
    private String nome;
    private String email;
    private boolean isEnabled;

    public UsuarioDTO() {
    }

    public UsuarioDTO(@Valid Usuario usuario) {
        this.setId(usuario.getId());
        this.setAuthorities(usuario.getPerfisDeAcesso());
        this.setNome(usuario.getNome());
        this.setUsername(usuario.getUsername());
        this.setEmail(usuario.getEmail());
        this.setEnabled(usuario.isEnabled());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<PerfilDeAcesso> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<PerfilDeAcesso> authorities) {
        this.authorities = authorities;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
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

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }
}
