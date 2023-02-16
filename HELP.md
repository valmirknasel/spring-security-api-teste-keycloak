# Leia Primeiro!

Projeto de exemplo do uso do Spring Security + OAuth2 para prover seguran�a em microsservi�os.

## Getting Started

1. O presente projeto � configurado como um Resource Server protegido por Autentica��o via Keycloak e 
autoriza��o via OAuth2 + JWT. Algumas APIs est�o configuradas de modo a demonstrar o uso dos perfis 
criados no Keycloak para autentica��o e autoriza��o de acesso aos recursos protegidos; 

2. � necess�rio criar os respectivos usu�rios no Keycloak dentro de um Realm (Reino) e tamb�m um Client 
dentro do mesmo Realm;

3.  � necess�rio criar um Mapper no Client para mapear as Roles (Perfis de Acesso), conforme explicado na 
documenta��o da classe SecurityConfig.java; 

4. Esse mapeamento no Client do Keycloak far� com que o Spring Security 
consiga ler as Roles de usu�rio corretamente e aplicar as restri��es de autoriza��o de acesso aos Resources 
(Controllers).

5. O presente projeto � uma API REST simples, mas que permite ter uma base de como construir um microsservi�o 
completo que tem seus recursos protegidos via OAuth2;

6. A partir dessa API, � poss�vel construir um Client Front End para consumir ela em qualquer linguagem,
desde que ele utilize a autentica��o via Keycloak e autoriza��o via OAuth2 + JWT Bearer Token.
 

### Reference Documentation

For further reference, please consider the following sections:

* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.2/maven-plugin/reference/html/)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#using.devtools)
* [Spring Data JPA](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#data.sql.jpa-and-spring-data)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web)
* [Spring Security](https://docs.spring.io/spring-boot/docs/3.0.2/reference/htmlsingle/#web.security)

### Guides

The following guides illustrate how to use some features concretely:

* [Accessing Data with JPA](https://spring.io/guides/gs/accessing-data-jpa/)
* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Securing a Web Application](https://spring.io/guides/gs/securing-web/)
* [Spring Boot and OAuth2](https://spring.io/guides/tutorials/spring-boot-oauth2/)
* [Authenticating a User with LDAP](https://spring.io/guides/gs/authenticating-ldap/)

