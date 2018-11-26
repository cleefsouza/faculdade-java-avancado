package caixadereliquias.controller;

import caixadereliquias.model.Colecionavel;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IColecionaveis {

    // adicionar objetos no banco de dados
    void adicionar(Colecionavel colecionavel);

    // listar colecionaveis pelo tipo de estado
    List<Object> listarPorEstado();
}
