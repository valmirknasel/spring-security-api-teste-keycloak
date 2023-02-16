INSERT INTO public.tb_usuario(
    id_usuario, email, is_enabled, nome, password, username)
VALUES (1, 'teste@gmail.com', true, 'Usuario Teste 1', '123', 'teste1');


INSERT INTO public.tb_perfil_de_acesso(
    id_perfil, descricao, nome_perfil)
VALUES (1, 'Administrador do Sistema', 'ADMIN');

INSERT INTO public.tb_usuario_perfil (id_usuario, id_perfil)
VALUES (1,1);


select * from tb_usuario;
select * from tb_perfil_de_acesso;
select * from tb_usuario_perfil;


