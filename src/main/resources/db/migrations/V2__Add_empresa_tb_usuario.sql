-- Migrations para adicionar a coluna de EMPRESA na tabela de usuários.
ALTER TABLE tb_usuario
ADD COLUMN empresa VARCHAR(255);