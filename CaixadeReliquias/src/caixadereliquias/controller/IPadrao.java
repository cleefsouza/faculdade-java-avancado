package caixadereliquias.controller;

import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IPadrao {

    // remover objeto do banco de dados
    void remover(int cod);

    // buscar objeto especifico do banco de dados
    Object buscar(int cod);

    // listar objetos do banco de dados
    List listar();
}
