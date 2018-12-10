package cinelist.controller;

import cinelist.model.Tipo;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface ITipo {

    // buscar tipo
    Tipo buscar(int cod);
    
    // listar tipos
    List<Tipo> listar();
}
