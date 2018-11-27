package cinelist.dao;

import cinelist.model.Genero;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import cinelist.controller.IGeneroDAO;
import cinelist.controller.IPadraoDAO;

/**
 *
 * @author cleefsouza
 */
public class GeneroDAO implements IPadraoDAO, IGeneroDAO {

    // recebe conexão
    Connection conn = null;

    // construtor
    GeneroDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    // cadastrar
    @Override
    public void cadastrar(Genero genero) {
        String sql = "INSERT INTO genero(nome_gen) VALUES(?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, genero.getNome_gen());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar genero: " + e.getMessage());
        }
    }

    // remover
    @Override
    public void remover(int cod) {
        String sql = "DELETE FROM genero WHERE cod_gen = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover genero: " + e.getMessage());
        }
    }

    // alterar
    @Override
    public void alterar(int cod) {
        Genero genero = (Genero) buscar(cod);
        String sql = "UPDATE SET genero nome_gen = ? WHERE cod_gen = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, genero.getNome_gen());
            pstm.setInt(2, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar genero: " + e.getMessage());
        }
    }

    // buscar
    @Override
    public Object buscar(int cod) {
        Object genero = null;
        String sql = "SELECT * FROM genero WHERE cod_gen = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                genero = new Genero(rs.getInt("cod_gen"), rs.getString("nome_gen"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar genero: " + e.getMessage());
        }
        return genero;
    }

    // listar
    @Override
    public List<Genero> listar() {
        List<Genero> lista = null;
        String sql = "SELECT * FROM genero;";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            Object genero;
            lista = new ArrayList<>();
            while (rs.next()) {
                genero = new Genero(rs.getInt("cod_gen"), rs.getString("nome_gen"));
                lista.add((Genero) genero);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar genero: " + e.getMessage());
        }
        return lista;
    }
}
