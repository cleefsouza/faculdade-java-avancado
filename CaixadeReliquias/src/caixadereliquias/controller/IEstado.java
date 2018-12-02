package caixadereliquias.controller;

import caixadereliquias.model.Estado;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IEstado {

    // buscar objeto especifico do banco de dados
    Estado buscar(int cod);

    // listar objetos do banco de dados
    List<Estado> listar();
}
