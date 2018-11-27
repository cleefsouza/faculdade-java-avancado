package cinelist.dao;

import cinelist.controller.IDiretorDAO;
import cinelist.model.Diretor;
import cinelist.model.Filme;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import cinelist.model.Genero;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import cinelist.controller.IPadraoDAO;

/**
 *
 * @author cleefsouza
 */
public class DiretorDAO implements IPadraoDAO, IDiretorDAO {

    // recebe conexão
    Connection conn = null;

    // construtor
    DiretorDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    // cadastrar
    @Override
    public void cadastrar(Diretor diretor) {
        String sql = "INSERT INTO diretor(nome_dir) VALUES(?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, diretor.getNome_dir());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar diretor: " + e.getMessage());
        }
    }

    // remover
    @Override
    public void remover(int cod) {
        String sql = "DELETE FROM diretor WHERE cod_dir = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover diretor: " + e.getMessage());
        }
    }

    // alterar
    @Override
    public void alterar(int cod) {
        Diretor diretor = (Diretor) buscar(cod);
        String sql = "UPDATE SET diretor nome_dir = ? WHERE cod_dir = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, diretor.getNome_dir());
            pstm.setInt(2, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar diretor: " + e.getMessage());
        }
    }

    // buscar
    @Override
    public Object buscar(int cod) {
        Object diretor = null;
        String sql = "SELECT * FROM diretor WHERE cod_dir = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                diretor = new Diretor(rs.getInt("cod_dir"), rs.getString("nome_dir"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar diretor: " + e.getMessage());
        }
        return diretor;
    }

    // listar
    @Override
    public List<Diretor> listar() {
        List<Diretor> lista = null;
        String sql = "SELECT * FROM diretor;";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            Object diretor;
            lista = new ArrayList<>();
            while (rs.next()) {
                diretor = new Diretor(rs.getInt("cod_dir"), rs.getString("nome_dir"));
                lista.add((Diretor) diretor);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar diretor: " + e.getMessage());
        }
        return lista;
    }

    // listar filmes dirigidos
    @Override
    public List<Filme> listarFilmesDirigidos(int cod) {
        List<Filme> lista = null;
        String sql = "SELECT * FROM filme f, diretor d, genero g WHERE d.cod_dir = ? AND f.diretor_fil = d.cod_dir AND f.genero_fil = g.cod_gen;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            Diretor diretor;
            Filme filme;
            Genero genero;
            lista = new ArrayList<>();
            while (rs.next()) {
                diretor = new Diretor(rs.getInt("cod_dir"), rs.getString("nome_dir"));
                genero = new Genero(rs.getInt("cod_gen"), rs.getString("nome_gen"));
                filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("descricao_fil"), genero, diretor);
                lista.add(filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filmes dirigidos: " + e.getMessage());
        }
        return lista;
    }
}
