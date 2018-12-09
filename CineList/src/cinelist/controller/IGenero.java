package cinelist.controller;

import cinelist.model.Genero;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IGenero {

    // cadastrar genero
    void cadastrar(Genero genero);

    //alterar genero
    void alterar(Genero genero);

    // listar genero
    List<Genero> listar();

    // buscar genero
    Genero buscar(int cod);

    // remover genero
    void remover(int cod);
}
