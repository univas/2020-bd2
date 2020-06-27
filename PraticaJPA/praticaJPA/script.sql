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
FOREIGN KEY ( registro_fk ) REFERENCES Gestor ( registro ) ;

--sequence para a tabela CIDADE
CREATE SEQUENCE SEQ_CIDADE START WITH 1 ;


--Prática 8
CREATE TABLE Estado (
ibgeUF INTEGER NOT NULL ,
nome VARCHAR ( 50 ) NOT NULL ,
sigla VARCHAR ( 2 ) NOT NULL ,
CONSTRAINT estado_pk PRIMARY KEY ( ibgeUF )
);
DELETE FROM CIDADE ; -- para facilitar a cria ç ão da FK
ALTER TABLE CIDADE ADD COLUMN ibgeUF_fk INTEGER NOT NULL ;
ALTER TABLE CIDADE DROP COLUMN ESTADO ;

ALTER TABLE Cidade ADD CONSTRAINT estado_cidade_fk
FOREIGN KEY ( ibgeUF_fk ) REFERENCES Estado ( ibgeUF ) ;


--Prática 10
--insert de teste com o estado MG para demonstração do update para correção
INSERT INTO CIDADE ( ibge , area , nome , Registro_fk , ibgeuf_fk )
VALUES ( 7890 , 321 , 'São Bento do Sapucaí' , NULL , 1234 ) ;
--o estado MG está errado de propósito

