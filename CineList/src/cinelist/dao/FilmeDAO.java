package cinelist.dao;

import cinelist.controller.IFilmeDAO;
import cinelist.controller.IPadraoDAO;
import cinelist.model.Diretor;
import cinelist.model.Filme;
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
public class FilmeDAO implements IPadraoDAO, IFilmeDAO {

    // recebe conexão
    Connection conn = null;

    // construtor
    FilmeDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    // cadastrar
    @Override
    public void cadastrar(Filme filme) {
        String sql = "INSERT INTO filme(nome_fil, descricao_fil, genero_fil, diretor_fil) VALUES(?,?,?,?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, filme.getNome_fil());
            pstm.setString(2, filme.getDescricao_fil());
            pstm.setInt(3, filme.getGenero_fil().getCod_gen());
            pstm.setInt(4, filme.getDiretor_fil().getCod_dir());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar filme: " + e.getMessage());
        }
    }

    // remover
    @Override
    public void remover(int cod) {
        String sql = "DELETE FROM filme WHERE cod_fil = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover filme: " + e.getMessage());
        }
    }

    // alterar
    @Override
    public void alterar(int cod) {
        Filme filme = (Filme) buscar(cod);
        String sql = "UPDATE SET filme nome_fil = ?, descricao_fil = ?, genero_fil = ?, diretor_fil = ? WHERE cod_fil = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, filme.getNome_fil());
            pstm.setString(2, filme.getDescricao_fil());
            pstm.setInt(3, filme.getGenero_fil().getCod_gen());
            pstm.setInt(4, filme.getDiretor_fil().getCod_dir());
            pstm.setInt(5, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar filme: " + e.getMessage());
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
                filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("descricao_fil"), genero, diretor);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar filme: " + e.getMessage());
            e.printStackTrace();
        }
        return filme;
    }

    // listar
    @Override
    public List<Filme> listar() {
        List<Filme> lista = null;
        String sql = "SELECT * FROM filme;";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            Object filme;
            Genero genero;
            Diretor diretor;
            lista = new ArrayList<>();
            while (rs.next()) {
                genero = (Genero) new GeneroDAO().buscar(rs.getInt("genero_fil"));
                diretor = (Diretor) new DiretorDAO().buscar(rs.getInt("diretor_fil"));
                filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("descricao_fil"), genero, diretor);

                lista.add((Filme) filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filme: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Filme> listarPorGenero(int cod) {
        List<Filme> lista = null;
        String sql = "SELECT * FROM filme WHERE genero_fil = ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            Object filme;
            Genero genero;
            Diretor diretor;
            lista = new ArrayList<>();
            while (rs.next()) {
                genero = (Genero) new GeneroDAO().buscar(rs.getInt("genero_fil"));
                diretor = (Diretor) new DiretorDAO().buscar(rs.getInt("diretor_fil"));
                filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("descricao_fil"), genero, diretor);

                lista.add((Filme) filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filmes: " + e.getMessage());
        }
        return lista;
    }
}
