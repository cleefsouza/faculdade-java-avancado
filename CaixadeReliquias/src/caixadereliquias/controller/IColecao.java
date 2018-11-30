package caixadereliquias.controller;

import caixadereliquias.model.Colecao;

/**
 *
 * @author cleefsouza
 */
public interface IColecao {

    // adicionar objetos no banco de dados
    void adicionar(Colecao colecao);

    // alterar dados do banco de dados
    void alterar(Colecao colecao);

    // retorna a quantidade de colecionaveis na colecao
    int qtdColecionaveis();
}
