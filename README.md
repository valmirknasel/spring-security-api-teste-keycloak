# Leia Primeiro!

Projeto de exemplo do uso do Spring Security + OAuth2 para prover segurança em microsserviços.

## Getting Started:

1. O presente projeto é configurado como um <b>Resource Server</b> protegido por Autenticação via <b>Keycloak</b> e 
<b>autorização via OAuth2 + JWT</b>. Algumas APIs estão configuradas de modo a demonstrar o uso dos perfis 
criados no Keycloak para autenticação e autorização de acesso aos recursos protegidos; 

2. É necessário criar os respectivos usuários no Keycloak dentro de um Realm (Reino) e também um Client 
dentro do mesmo Realm;

3.  É necessário criar um <b>Mapper</b> no Client para mapear as <b>Roles</b> (Perfis de Acesso) no token JWT, conforme explicado na 
documentação da classe <b>SecurityConfig.java</b>; 

4. Esse mapeamento no Client do Keycloak fará com que o Spring Security 
consiga ler as Roles de usuário corretamente e aplicar as restrições de autorização de acesso aos <b>Resources</b> 
(Controllers).

5. O presente projeto é uma API REST simples, mas que permite ter uma base de como construir um microsserviço 
completo que tem seus recursos protegidos via OAuth2;

6. A partir dessa API, é possível construir um Client Front End para consumir ela em qualquer linguagem,
desde que ele utilize a autenticação via Keycloak e autorização via OAuth2 + JWT Bearer Token.

## ETAPAS PARA EXECUÇÃO DO PROJETO 

1. Criar o banco <b>spring-usuarios</b> ou outro nome qualquer e renomear a propriedade customizada <b>app.datasource.db</b>
no arquivo <b>application-dev.yml</b> para corresponder com o nome do banco criado;

2. Configurar o <b>Host</b> e a <b>Porta</b> do Keycloak no arquivo application-dev.yml;

### 3. CONFIGURAÇÕES NO KEYCLOAK:


3.1 Criar o <b>Realm</b> no Keycloak e ajustar a propriedade <b>app.keycloak.realm</b> no arquivo 
<b>applicaion-dev.yml</b> para corresponder com o Realm criado;

3.2 Criar o <b>Client</b> no Realm criado na etapa anterior. O "Client" representa uma aplicação cliente (Front End) que irá 
acessar a API informando o respectivo <b>Client Id</b> e <b>Client Secret</b> para obter o JWT Bearer Token;

3.3 Criar as <b>Roles</b> ("ADMIN", "USER", "VIEW", etc) no respectivo Client, Aba Roles, de modo a corresponder com o 
mapeamento de permissões da classe <b>SecurityConfig.java</b>;

3.4 Criar um <b>Mapper</b> no Client criado na etapa 3.2 e atribuir um nome qualquer a ele, alterando a 
propriedade "Token Claim Name = roles";

## TESTANDO A API NO POSTMAN

1. No Postman, é necessário informar, na Aba <b>Authorization</b>, o "Type" como "OAuth 2.0" e o "Grant Type" como 
"Password Credentials". Isso indica que o usuário vai autenticar no Keycloak com usuário e senha para 
poder pegar o token JWT;

2. Ainda na Aba Authorizatrion, informar o "Access Token URL" com o endereço do keycloak no formato 
"http://<b> nome-do-host-do-keycloak</b>:<b>porta</b>/auth/realms/<b>nome-do-realm</b>/protocol/openid-connect/token";
   
3. Ainda na mesma aba, informar o <b>Client Id</b> e o <b>Client Secret</b>, obtidos no Client do Keycloak, 
criado na etapa 3.2 do item "<b>ETAPAS PARA EXECUÇÃO DO PROJETO</b>", para poder obter o token JWT;

4. Informar o <b>Username</b> e <b>Password</b> de um dos usuários criados no Realm do Keycloak criado na etapa 3.1 do item 
"<b>ETAPAS PARA EXECUÇÃO DO PROJETO</b>" e que possua as respectivas Roles configuradas na etapa 3.3;

5. Realizar as requisições para a API com as informações de autenticação e testar a autorização do OAuth2 passada no token JWT.

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
