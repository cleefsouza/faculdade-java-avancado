-- Script SQL - Banco de Dados - CineList

-- Criar tabela diretor
CREATE TABLE IF NOT EXISTS diretor(
    cod_dir INTEGER PRIMARY KEY,
    nome_dir TEXT
);

-- Criar tabela login
CREATE TABLE IF NOT EXISTS login(
    cod_log INTEGER PRIMARY KEY,
    usuario_log TEXT,
    senha_log TEXT
);

-- Criar tabela usuário
CREATE TABLE IF NOT EXISTS usuario(
    cod_usu INTEGER PRIMARY KEY,
    nome_usu TEXT,
    login_usu INTEGER,
    FOREIGN KEY(login_usu) REFERENCES login(cod_log)
);

-- Criar tabela genero
CREATE TABLE IF NOT EXISTS genero(
    cod_gen INTEGER PRIMARY KEY,
    nome_gen TEXT
);

-- Criar tabela filme
CREATE TABLE IF NOT EXISTS filme(
    cod_fil INTEGER PRIMARY KEY,
    nome_fil TEXT,
    genero_fil INTEGER,
    diretor_fil INTEGER,
    descricao_fil TEXT,
    usuario_fil INTEGER,
    FOREIGN KEY(genero_fil) REFERENCES genero(cod_gen),
    FOREIGN KEY(diretor_fil) REFERENCES diretor(cod_dir),
    FOREIGN KEY(usuario_fil) REFERENCES usuario(cod_usu)
);

-- Criar tabela critica
CREATE TABLE critica(
    cod_cri INTEGER PRIMARY KEY,
    descricao_cri TEXT,
    filme_cri INTEGER,
    nota_cri INTEGER,
    FOREIGN KEY(filme_cri) REFERENCES filme(cod_fil)
);

-- Inserindo login e usuario
INSERT INTO login(usuario_log, senha_log) VALUES("cleefsouza", "cleef123");
INSERT INTO usuario(nome_usu, login_usu) VALUES("Cleef Souza", 1);

-- Inserindo diretores
INSERT INTO diretor(nome_dir) VALUES("David Yates");
INSERT INTO diretor(nome_dir) VALUES("Brad Bird");
INSERT INTO diretor(nome_dir) VALUES("Bryan Singer");

-- Inserindo generos
INSERT INTO genero(nome_gen) VALUES("Fantasia");
INSERT INTO genero(nome_gen) VALUES("Ficção Cientifica");
INSERT INTO genero(nome_gen) VALUES("Biografia");

-- Inserindo filmes
INSERT INTO filme(nome_fil, diretor_fil, genero_fil, descricao_fil, usuario_fil) VALUES("Animais Fantasticos e Onde Habitam",1,1,"Um excêntrico magizoologista carrega uma maleta cheia de animais mágicos coletados durante suas viagens pelo mundo.",1);
INSERT INTO filme(nome_fil, diretor_fil, genero_fil, descricao_fil, usuario_fil) VALUES("Os Incriveis 2",2,2,"A Mulher Elástica entra em ação para salvar o dia, enquanto o Sr. Incrível enfrenta seu maior desafio até agora: cuidar dos problemas de seus três filhos.",1);
INSERT INTO filme(nome_fil, diretor_fil, genero_fil, descricao_fil, usuario_fil) VALUES("Bohemian Rhapsody",3,3,"Freddie Mercury, Brian May, Roger Taylor e John Deacon formam a banda de rock Queen em 1970. Quando o estilo de vida agitado de Mercury começa a sair de controle, o grupo precisa encontrar uma forma de lidar com o sucesso e os excessos de seu líder.",1);

-- Inserindo criticas
INSERT INTO critica(descricao_cri, filme_cri, nota_cri) VALUES("Excelente filme, muito coerente com o universo de Harry Potter",1,5);
INSERT INTO critica(descricao_cri, filme_cri, nota_cri) VALUES("Filme divertido, uma otima opção para familia",2,4);
INSERT INTO critica(descricao_cri, filme_cri, nota_cri) VALUES("O filme deixa claro quem foi o Freddie e a banda Queen",3,4);
