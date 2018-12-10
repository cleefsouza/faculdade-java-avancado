package cinelist.dao;

import cinelist.controller.IGenero;
import cinelist.model.Genero;
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
public class GeneroDAO implements IGenero {

    // recebe conexão
    Connection conn = null;

    // construtor
    public GeneroDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void cadastrar(Genero genero) {
        String sql = "insert into genero(nome_gen) values (?)";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, genero.getNome_ite());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar genero: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Genero genero) {
        String sql = "update genero set nome_gen = ? where cod_gen=?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, genero.getNome_ite());
            pstm.setInt(2, genero.getCod_ite());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar genero: " + e.getMessage());
        }
    }

    @Override
    public List<Genero> listar() {
        List<Genero> lista = null;
        String sql = "select * from genero";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            lista = new ArrayList<>();
            while (rs.next()) {
                Genero genero = new Genero(rs.getInt("cod_gen"), rs.getString("nome_gen"));
                lista.add(genero);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar generos: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public Genero buscar(int cod) {
        String sql = "select * from genero where cod_gen=?";
        Genero genero = null;
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

    @Override
    public void remover(int cod) {
        String sql = "delete from genero where cod_gen = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            removerPorGenero(cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover genero: " + e.getMessage());
        }
    }

    @Override
    public int qtdFilmePorGenero(int cod) {
        int qtd = 0;
        String sql = "select count(cod_fil) from filme where genero_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            qtd = rs.getInt("count(cod_fil)");

        } catch (SQLException e) {
            System.err.println("Erro ao buscar quantidade de filmes por gênero: " + e.getMessage());
        }
        return qtd;
    }

    @Override
    public void removerPorGenero(int cod) {
        String sql = "delete from filme where genero_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover filmes do genero: " + e.getMessage());
        }
    }
}
