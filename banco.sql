CREATE DATABASE IF NOT EXISTS emp_servlet;
USE emp-servlet;

CREATE TABLE IF NOT EXISTS funcionarios (
	id integer PRIMARY KEY NOT NULL AUTO_INCREMENT,
	nome VARCHAR(250) NOT NULL,
	password VARCHAR(250) NOT NULL,
	email VARCHAR(100) NOT NULL,
	pais VARCHAR(50)
);