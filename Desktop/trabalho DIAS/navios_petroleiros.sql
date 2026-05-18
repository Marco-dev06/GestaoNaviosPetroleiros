CREATE DATABASE IF NOT EXISTS navios_petroleiros CHARACTER SET utf8mb4;
USE navios_petroleiros;

CREATE TABLE porto (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    pais VARCHAR(80)  NOT NULL
);

CREATE TABLE tipo_navio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    designacao VARCHAR(80) NOT NULL,
    max_cargas INT NOT NULL DEFAULT 1
);

CREATE TABLE tipo_carga (
    id         INT AUTO_INCREMENT PRIMARY KEY,
    nome       VARCHAR(80) NOT NULL,
    inflamavel BOOLEAN     NOT NULL DEFAULT FALSE,
    corrosiva  BOOLEAN     NOT NULL DEFAULT FALSE,
    toxica     BOOLEAN     NOT NULL DEFAULT FALSE
);

CREATE TABLE navio (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    codigo_imo VARCHAR(20)  NOT NULL UNIQUE,
    tipo_navio_id INT NOT NULL,
    capacidade_max DOUBLE NOT NULL,
    num_tanques INT NOT NULL,
    bandeira VARCHAR(60),
    ano_fabrico YEAR,
    estado ENUM('ATIVO','EM_MANUTENCAO','INATIVO') NOT NULL DEFAULT 'ATIVO',
    porto_id INT,
    FOREIGN KEY (tipo_navio_id) REFERENCES tipo_navio(id),
    FOREIGN KEY (porto_id) REFERENCES porto(id)
);

CREATE TABLE carga (
    id INT AUTO_INCREMENT PRIMARY KEY,
    descricao VARCHAR(120) NOT NULL,
    tipo_carga_id INT NOT NULL,
    volume DOUBLE,
    peso DOUBLE,
    FOREIGN KEY (tipo_carga_id) REFERENCES tipo_carga(id)
);

CREATE TABLE tripulante (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(120) NOT NULL,
    documento VARCHAR(40)  NOT NULL UNIQUE,
    funcao ENUM('CAPITAO','OFICIAL','ENGENHEIRO','OPERADOR') NOT NULL,
    disponive BOOLEAN NOT NULL DEFAULT TRUE
);

CREATE TABLE viagem (
    id INT AUTO_INCREMENT PRIMARY KEY,
    navio_id INT NOT NULL,
    porto_origem_id INT NOT NULL,
    porto_destino_id INT NOT NULL,
    data_partida DATE NOT NULL,
    data_chegada DATE,
    estado ENUM('PLANEADA','EM_CURSO','CONCLUIDA','CANCELADA') NOT NULL DEFAULT 'PLANEADA',
    FOREIGN KEY (navio_id) REFERENCES navio(id),
    FOREIGN KEY (porto_origem_id) REFERENCES porto(id),
    FOREIGN KEY (porto_destino_id) REFERENCES porto(id)
);

CREATE TABLE viagem_carga (
    viagem_id INT NOT NULL,
    carga_id  INT NOT NULL,
    PRIMARY KEY (viagem_id, carga_id),
    FOREIGN KEY (viagem_id) REFERENCES viagem(id),
    FOREIGN KEY (carga_id) REFERENCES carga(id)
);

CREATE TABLE viagem_tripulante (
    viagem_id INT NOT NULL,
    tripulante_id INT NOT NULL,
    PRIMARY KEY (viagem_id, tripulante_id),
    FOREIGN KEY (viagem_id) REFERENCES viagem(id),
    FOREIGN KEY (tripulante_id) REFERENCES tripulante(id)
);
