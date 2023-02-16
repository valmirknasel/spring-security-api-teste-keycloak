package com.knasel.springsecurityapiteste.domain.repository;

import com.knasel.springsecurityapiteste.domain.PerfilDeAcesso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilDeAcessoRepository extends JpaRepository<PerfilDeAcesso, Long> {
}
