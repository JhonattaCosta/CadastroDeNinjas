-- V2: Migratiosn Add the rank column in tb_cadastro
ALTER TABLE tb_cadastro
ADD COLUMN rank VARCHAR(255);