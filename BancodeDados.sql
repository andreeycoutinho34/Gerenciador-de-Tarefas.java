-- Cria o banco de dados
CREATE DATABASE GerenciadorTarefas;

-- Seleciona o banco de dados
USE GerenciadorTarefas;

-- Cria a tabela Tarefa
CREATE TABLE Tarefa (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    prioridade INT,
    status INT
);

-- Adiciona um indice para o campo titulo para melhorar a performance das consultas
CREATE INDEX idx_titulo ON Tarefa (titulo);
