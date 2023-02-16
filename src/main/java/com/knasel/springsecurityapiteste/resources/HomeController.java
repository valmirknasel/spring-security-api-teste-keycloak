package com.knasel.springsecurityapiteste.resources;

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/**")
public class HomeController {

    @GetMapping
    public String home() {
        return "Welcome to the Home Page! It Works!";
    }

    @PostMapping
    public String homePost() {
        return "Welcome to the Home Page! It Works!";
    }

    @GetMapping("/api/v1/public")
    public String publicArea() {
        return "You are accessing a Public Area!";
    }

    @GetMapping("/api/v1/user")
    public String userArea(@AuthenticationPrincipal Jwt user) {
        return "You are accessing a Private Area! " + user.getClaims();
    }

    @GetMapping("/api/v1/readonly")
    public String readOnlyArea(@AuthenticationPrincipal Jwt user) {
        return "You are accessing a Read Only Area! " + user.getClaims();
    }
}
