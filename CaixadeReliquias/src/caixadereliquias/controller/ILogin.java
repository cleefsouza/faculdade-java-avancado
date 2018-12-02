package caixadereliquias.controller;

import caixadereliquias.model.Login;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public interface ILogin {

    // buscar objeto especifico do banco de dados
    Login buscar(int cod);

    // alterar dados do banco de dados
    void alterar(Login login);

    // autenticar login
    boolean autenticarLogin(Login login);
}
