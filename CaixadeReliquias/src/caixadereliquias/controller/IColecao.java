package caixadereliquias.controller;

import caixadereliquias.model.Colecao;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IColecao {

    // remover objeto do banco de dados
    void remover(int cod);

    // buscar objeto especifico do banco de dados
    Colecao buscar(int cod);

    // listar objetos do banco de dados
    List<Colecao> listar();

    // adicionar objetos no banco de dados
    void adicionar(Colecao colecao);

    // alterar dados do banco de dados
    void alterar(Colecao colecao);

    // retorna a quantidade de colecionaveis na colecao
    int qtdColecionaveis(int cod);

    // quantidade de coleções
    int qtdColecoes();
    
    // listar recentes
    List<Colecao> listarRecentes(int lim);
}
