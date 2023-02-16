package com.knasel.springsecurityapiteste.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Entity(name = "tb_usuario")
public class Usuario implements UserDetails, Serializable {

    @Id @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "usuario_sequence")
    @SequenceGenerator(name = "usuario_sequence", sequenceName = "usuario_seq", allocationSize = 1)
    private Long idUsuario;

    @OneToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "tb_usuario_perfil", joinColumns = @JoinColumn(name = "id_usuario"), inverseJoinColumns = @JoinColumn(name = "id_perfil"))
    private List<PerfilDeAcesso> authorities;

    @NotNull
    private String username;
    @NotNull
    private String password;
    @NotNull
    private String nome;
    @NotNull @Email
    private String email;
    @NotNull
    private boolean isEnabled;


    public Long getId() {
        return idUsuario;
    }

    public void setId(Long id) {
        this.idUsuario = id;
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

    /**
     * @return lista de perfis de acesso do usuario gerada a partir do nome de cada perfil de acesso habilitado para o usuario
     */
    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities.stream().map(authority -> new SimpleGrantedAuthority(authority.getNomeDoPerfil())).collect(Collectors.toList());
    }

    public void setAuthorities(List<PerfilDeAcesso> authorities) {
        this.authorities = authorities;
    }

    public List<PerfilDeAcesso> getPerfisDeAcesso() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean isAtivo) {
        this.isEnabled = isAtivo;
    }
}
