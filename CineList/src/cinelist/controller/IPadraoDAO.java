package cinelist.controller;

import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IPadraoDAO {
    
    // remover objeto do banco de dados
    void remover(int cod);

    // alterar dados do banco de dados
    void alterar(int cod);

    // buscar objeto especifico do banco de dados
    Object buscar(int cod);

    // listar objetos do banco de dados
    List listar();
}
