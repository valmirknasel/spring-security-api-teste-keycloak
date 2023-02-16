# Leia Primeiro!

Projeto de exemplo do uso do Spring Security + OAuth2 para prover segurança em microsserviços.

## Getting Started:

1. O presente projeto é configurado como um Resource Server protegido por Autenticação via Keycloak e 
autorização via OAuth2 + JWT. Algumas APIs estão configuradas de modo a demonstrar o uso dos perfis 
criados no Keycloak para autenticação e autorização de acesso aos recursos protegidos; 

2. É necessário criar os respectivos usuários no Keycloak dentro de um Realm (Reino) e também um Client 
dentro do mesmo Realm;

3.  É necessário criar um Mapper no Client para mapear as Roles (Perfis de Acesso), conforme explicado na 
documentação da classe SecurityConfig.java; 

4. Esse mapeamento no Client do Keycloak fará com que o Spring Security 
consiga ler as Roles de usuário corretamente e aplicar as restrições de autorização de acesso aos Resources 
(Controllers).

5. O presente projeto é uma API REST simples, mas que permite ter uma base de como construir um microsserviço 
completo que tem seus recursos protegidos via OAuth2;

6. A partir dessa API, é possível construir um Client Front End para consumir ela em qualquer linguagem,
desde que ele utilize a autenticação via Keycloak e autorização via OAuth2 + JWT Bearer Token.
 

## ETAPAS PARA EXECUÇÃO DO PROJETO 

1. Criar o banco <b>spring-usuarios</b> ou outro nome qualquer e renomear a propriedade <b>app.datasource.db</b>
no arquivo application-dev.yml para corresponder com o nome do banco criado;

2. Configurar o Host e a porta do Keycloak no arquivo application-dev.yml;

3. Criar o Realm no Keycloak e ajustar a propriedade <b>app.keycloak.realm</b> para corresponder com o Realm criado;

4. Criar o Client no Keycloak;

5. Criar as Roles ("ADMIN", "USER", "VIEW") no respectivo Client, Aba Roles, de modo a corresponder com o mapeamento da 
classe SecurityConfig.java;

6. Criar um mapper no Client e atribuir um nome qualquer a ele, alterando a propriedade "Token Claim Name = roles";

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
