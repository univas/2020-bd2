--Prática 2
CREATE TABLE Gestor (
registro INTEGER NOT NULL ,
nome VARCHAR ( 50 ) NOT NULL ,
inicioMandato DATE NOT NULL ,
CONSTRAINT gestor_pk PRIMARY KEY ( registro )
);


--Prática 3
CREATE TABLE Cidade (
ibge INTEGER NOT NULL ,
area INTEGER NOT NULL ,
nome VARCHAR ( 50 ) NOT NULL ,
estado VARCHAR ( 30 ) NOT NULL ,
registro_fk INTEGER ,
CONSTRAINT cidade_pk PRIMARY KEY ( ibge )
);

ALTER TABLE Cidade ADD CONSTRAINT gestor_cidade_fk
FOREIGN KEY ( registro_fk )
REFERENCES Gestor ( registro ) ;

--sequence para a tabela CIDADE
CREATE SEQUENCE SEQ_CIDADE START WITH 1 ;

