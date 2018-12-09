package cinelist.controller;

import cinelist.model.Usuario;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface IUsuario {

    // cadastra usuário
    void cadastrar(Usuario usuario);

    //altera usuário
    void alterar(Usuario usuario);

    // remover usuário
    void remover(int cod);

    // buscar usuario
    Usuario buscar(int cod);

    // buscar por login
    Usuario buscarPorLogin(int cod);

    // listar
    List<Usuario> listar();
}
