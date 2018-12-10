package cinelist.controller;

import cinelist.model.Historico;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IHistorico {
    
    // registrar ação
    void registrarAcao(Historico historico);
    
    // listar historico
    List<Historico> listar();
}
