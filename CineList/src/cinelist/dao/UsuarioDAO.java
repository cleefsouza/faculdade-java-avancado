package cinelist.dao;

import cinelist.controller.IPadraoDAO;
import cinelist.model.Diretor;
import cinelist.model.Filme;
import cinelist.model.Genero;
import cinelist.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public class UsuarioDAO implements IPadraoDAO {

    // recebe conexão
    Connection conn = null;

    // construtor
    UsuarioDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void remover(int cod) {
        // a classe Usuario não implementa esse metodo
    }

    // alterar
    @Override
    public void alterar(int cod) {
        Usuario usuario = (Usuario) buscar(cod);
        String sql = "UPDATE SET usuario nome_usu = ? WHERE cod_usu = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, usuario.getNome_usu());
            pstm.setInt(2, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar usuário: " + e.getMessage());
        }
    }

    // buscar
    @Override
    public Object buscar(int cod) {
        Object filme = null;
        String sql = "SELECT * FROM filme WHERE cod_fil = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Genero genero = (Genero) new GeneroDAO().buscar(rs.getInt("genero_fil"));
                Diretor diretor = (Diretor) new DiretorDAO().buscar(rs.getInt("diretor_fil"));
                Usuario usuario = (Usuario) new UsuarioDAO().buscar(rs.getInt("usuario_fil"));
                filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("descricao_fil"), genero, diretor, usuario);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar filme: " + e.getMessage());
            e.printStackTrace();
        }
        return filme;
    }

    // listar
    @Override
    public List<Object> listar() {
        // a classe Usuario não implementa esse metodo
        return null;
    }
}
