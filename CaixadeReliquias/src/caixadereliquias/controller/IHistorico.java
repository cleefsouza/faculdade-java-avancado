package caixadereliquias.controller;

import caixadereliquias.model.Historico;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IHistorico {

    // adicionar objetos no banco de dados
    void registrarAcao(Historico historico);

    // lista o historico
    List<Historico> listar();

    // lista o historico
    List<Historico> listarRecentes(int lim);
}
