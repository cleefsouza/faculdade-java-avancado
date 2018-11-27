package cinelist.controller;

import cinelist.model.Genero;

/**
 *
 * @author cleefsouza
 */
public interface IGeneroDAO {

    // cadastrar objeto genero no banco de dados
    void cadastrar(Genero genero);
}
