package caixadereliquias.dao;

import caixadereliquias.controller.IPadrao;
import caixadereliquias.controller.IUsuario;
import caixadereliquias.model.Usuario;
import java.sql.Connection;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public class UsuarioDAO implements IPadrao, IUsuario {

    // recebe conexão
    Connection conn = null;

    // construtor
    UsuarioDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void adicionar(Usuario usuario) {
    }

    @Override
    public void remover(int cod) {
    }

    @Override
    public void alterar(int cod) {
    }

    @Override
    public Object buscar(int cod) {
        return null;
    }

    @Override
    public List listar() {
        return null;
    }
}
