package cinelist.controller;

import cinelist.model.Login;

/**
 *
 * @author cleefsouza
 */
public interface ILogin {

    // cadastrar login
    void cadastrar(Login login);

    // buscar login
    Login buscar(int cod);

    // alterar login
    void alterar(Login login);

    // remover login
    void remover(int cod);

    // autenticar login
    boolean autenticarLogin(Login login);

    // buscar login por usuário
    Login buscarPorUsuario(String usuario);
}
