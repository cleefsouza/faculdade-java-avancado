package caixadereliquias.controller;

import caixadereliquias.model.Colecionavel;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IColecionavel {

    // adicionar objetos no banco de dados
    void adicionar(Colecionavel colecionavel);

    // alterar dados do banco de dados
    void alterar(Colecionavel colecionavel);

    // listar colecionaveis pelo tipo de estado
    List<Object> listarPorEstado(String descricao);
}
