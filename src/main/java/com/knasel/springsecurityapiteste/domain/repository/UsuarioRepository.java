package com.knasel.springsecurityapiteste.domain.repository;

import com.knasel.springsecurityapiteste.domain.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
