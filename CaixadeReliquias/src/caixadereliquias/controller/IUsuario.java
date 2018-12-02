package caixadereliquias.controller;

import caixadereliquias.model.Usuario;

/**
 *
 * @author cleefsouza
 */
public interface IUsuario {

    // buscar objeto especifico do banco de dados
    Usuario buscar(int cod);

    // alterar dados do banco de dados
    void alterar(Usuario usuario);

    // buscar usuário por login
    public Usuario buscarPorLogin(int cod);
}
