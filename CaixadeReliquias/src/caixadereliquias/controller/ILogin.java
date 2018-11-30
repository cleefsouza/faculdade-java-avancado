package caixadereliquias.controller;

import caixadereliquias.model.Login;

/**
 *
 * @author cleefsouza
 */
public interface ILogin {

    // alterar dados do banco de dados
    void alterar(Login login);

    // autenticar login
    boolean autenticarLogin(Login login);
}
