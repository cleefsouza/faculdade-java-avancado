package caixadereliquias.controller;

import caixadereliquias.model.Colecionavel;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IColecionavel {

    // remover objeto do banco de dados
    void remover(int cod);

    // buscar objeto especifico do banco de dados
    Colecionavel buscar(int cod);

    // listar objetos do banco de dados
    List<Colecionavel> listar();

    // adicionar objetos no banco de dados
    void adicionar(Colecionavel colecionavel);

    // alterar dados do banco de dados
    void alterar(Colecionavel colecionavel);

    // listar colecionaveis recentes
    List<Colecionavel> listarRecentes(int lim);

    /*
     *
     * quantidade de colecionaveis
     */
    int qtdTotal();

    int qtdSeminovo();

    int qtdNovo();
}
