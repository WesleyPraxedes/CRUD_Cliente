create database crud_cliente;

use crud_cliente

CREATE TABLE  tb_cliente(
  id_cliente int(10) NOT NULL AUTO_INCREMENT,
  nome varchar(100) NOT NULL,
  email varchar(100) DEFAULT NULL,
  telefone bigint(10) unsigned DEFAULT NULL,
  cpf double DEFAULT NULL,
  sexo enum('M','F') DEFAULT NULL,
  salario decimal(10,2) DEFAULT NULL,
  datanascimento date DEFAULT NULL,
  datacadastro datetime DEFAULT NULL,
)