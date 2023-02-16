package com.knasel.springsecurityapiteste.resources;

import com.knasel.springsecurityapiteste.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("api/v1/admin")
public class UsuariosResource {

    private final UsuarioService usuarioService;

    public UsuariosResource(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @GetMapping("/usuarios")
    public ResponseEntity<?> findAll(@AuthenticationPrincipal Jwt usr) {
        return ResponseEntity.ok().body(this.usuarioService.findAll());
    }

    @GetMapping
    public ResponseEntity<?> token(@AuthenticationPrincipal Jwt usr) {
        Map<String, Object> claims = usr.getClaims();
        return ResponseEntity.ok().body(claims);
    }

}
