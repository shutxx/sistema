CREATE DATABASE Sistema;

CREATE TABLE PessoaPadrao (
    id_pessoa INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    nome_pessoa VARCHAR(60) NOT NULL,
    cpf VARCHAR(15) NOT NULL,
    telefone VARCHAR(20) NOT NULL,
    email VARCHAR(60) NOT NULL,
    id_endereco INTEGER NOT NULL
);

DROP TABLE PessoaPadrao;

ALTER TABLE PessoaPadrao ADD CONSTRAINT fk_endereco
	FOREIGN KEY (id_endereco)
    REFERENCES endereco(id_endereco);

CREATE TABLE Endereco (
    id_endereco INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    rua VARCHAR(60) NOT NULL,
    numero VARCHAR(10) NOT NULL,
    bairro VARCHAR(60) NOT NULL,
    cep VARCHAR(10) NOT NULL,
    cidade VARCHAR(60) NOT NULL,
    uf VARCHAR(10) NOT NULL
);

CREATE TABLE Usuario (
    id_usuario INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    login VARCHAR(60) NOT NULL,
    senha VARCHAR(60) NOT NULL,
    id_pessoa INTEGER NOT NULL,
    CONSTRAINT fk_pessoa FOREIGN KEY (id_pessoa)
        REFERENCES PessoaPadrao (id_pessoa)
);

CREATE TABLE Funcionario (
    id_funcionario INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    salario DECIMAL(10 , 2 ) NOT NULL,
    cargo VARCHAR(60) NOT NULL,
    id_pessoa INTEGER NOT NULL,
    CONSTRAINT fk_pessoafunc FOREIGN KEY (id_pessoa)
        REFERENCES PessoaPadrao (id_pessoa)
);

CREATE TABLE Produto (
id_produto  INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
nome_produto VARCHAR(60) NOT NULL,
descricao VARCHAR(60),
marca VARCHAR(60),
preco DECIMAL(10 , 2 ) NOT NULL);

CREATE TABLE Estoque (
    id_estoque INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    quantidade INTEGER NOT NULL,
    id_produto INTEGER NOT NULL,
    CONSTRAINT fk_produto FOREIGN KEY (id_produto)
        REFERENCES Produto (id_produto)
);

CREATE TABLE OrdemServico (
    id_os INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_pessoa INTEGER NOT NULL,
    data DATE NOT NULL,
    id_funcionario INTEGER NOT NULL,
    descricao_servico VARCHAR(60) NOT NULL,
    valor_servico DECIMAL(10 , 2 ) NOT NULL,
    CONSTRAINT fk_pessoaOS FOREIGN KEY (id_pessoa)
        REFERENCES PessoaPadrao (id_pessoa),
    CONSTRAINT fk_funcionario FOREIGN KEY (id_funcionario)
        REFERENCES Funcionario (id_funcionario)
);

CREATE TABLE Venda (
    id_venda INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_pessoa INTEGER NOT NULL,
    data DATE NOT NULL,
    id_funcionario INTEGER NOT NULL,
    id_itensVenda INTEGER NOT NULL,
    valorTotal DECIMAL(10 , 2 ) NOT NULL,
    CONSTRAINT fk_pessoaVenda FOREIGN KEY (id_pessoa)
        REFERENCES PessoaPadrao (id_pessoa),
    CONSTRAINT fk_funcionarioVenda FOREIGN KEY (id_funcionario)
        REFERENCES Funcionario (id_funcionario),
    CONSTRAINT fk_itensVenda FOREIGN KEY (id_itensVenda)
        REFERENCES ItensVenda (id_itensVenda)
);

CREATE TABLE ItensVenda (
    id_itensVenda INTEGER NOT NULL PRIMARY KEY AUTO_INCREMENT NOT NULL,
    id_produto INTEGER NOT NULL,
    preco_item DECIMAL(10 , 2 ) NOT NULL,
    quantidade_item INTEGER NOT NULL,
    CONSTRAINT fk_produtoVenda FOREIGN KEY (id_produto)
        REFERENCES Produto (id_produto)
);