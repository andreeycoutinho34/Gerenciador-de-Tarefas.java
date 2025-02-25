CREATE DATABASE GerenciadorTarefas;

USE GerenciadorTarefas;

CREATE TABLE Tarefa (
    id INT PRIMARY KEY AUTO_INCREMENT,
    titulo VARCHAR(100) NOT NULL,
    descricao TEXT,
    prioridade INT,
    status INT
);
