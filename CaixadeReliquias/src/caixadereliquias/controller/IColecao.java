package caixadereliquias.controller;

import caixadereliquias.model.Colecao;

/**
 *
 * @author cleefsouza
 */
public interface IColecao {

    // adicionar objetos no banco de dados
    void adicionar(Colecao colecao);

    // retorna a quantidade de colecionaveis na colecao
    int qtdColecionaveis();
}
