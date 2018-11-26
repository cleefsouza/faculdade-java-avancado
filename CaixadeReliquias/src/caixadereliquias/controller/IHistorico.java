package caixadereliquias.controller;

import caixadereliquias.model.Historico;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IHistorico {

    // adicionar objetos no banco de dados
    void registrarAcao(Historico historico);
    
    // lista o historico pela data obtida
    List<Object> listarPorData(Date data);
}
