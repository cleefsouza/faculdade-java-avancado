package cinelist.dao;

import cinelist.controller.IFilme;
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
public class FilmeDAO implements IFilme {

    // recebe conexão
    Connection conn = null;

    // construtor
    FilmeDAO() {
        // recebe conexão
        this.conn = new cinelist.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void cadastrar(Filme filme) {
        String sql = "insert into filme(nome_fil, sinopse_fil, diretor_fil, genero_fil, critica_fil, nota_fil) values (?,?,?,?,?,?)";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, filme.getNome_ite());
            pstm.setString(2, filme.getSinopse_fil());
            pstm.setInt(3, filme.getDiretor_fil().getCod_ite());
            pstm.setInt(4, filme.getGenero_fil().getCod_ite());
            pstm.setString(5, filme.getCritica_fil());
            pstm.setInt(6, filme.getNota_fil());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao cadastrar filme: " + e.getMessage());
        }
    }

    @Override
    public void alterar(Filme filme) {
        String sql = "update filme set nome_fil = ?, sinopse_fil = ?, diretor_fil = ?,  genero_fil = ?, critica_fil = ?, nota_fil = ? where cod_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, filme.getNome_ite());
            pstm.setString(2, filme.getSinopse_fil());
            pstm.setInt(3, filme.getDiretor_fil().getCod_ite());
            pstm.setInt(4, filme.getGenero_fil().getCod_ite());
            pstm.setString(5, filme.getCritica_fil());
            pstm.setInt(6, filme.getNota_fil());
            pstm.setInt(7, filme.getCod_ite());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao alterar filme: " + e.getMessage());
        }
    }

    @Override
    public Filme buscar(int cod) {
        String sql = "select * from filme where cod_fil=?";
        Filme filme = null;
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();
            while (rs.next()) {
                Diretor diretor = new DiretorDAO().buscar(rs.getInt("diretor_fil"));
                Genero genero = new GeneroDAO().buscar(rs.getInt("genero_fil"));
                filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("sinopse_fil"), genero, diretor, rs.getString("critica_fil"), rs.getInt("nota_fil"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar filme: " + e.getMessage());
        }
        return filme;
    }

    @Override
    public List<Filme> listar() {
        List<Filme> lista = null;
        String sql = "select * from filme";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            lista = new ArrayList<>();
            while (rs.next()) {
                Diretor diretor = new DiretorDAO().buscar(rs.getInt("diretor_fil"));
                Genero genero = new GeneroDAO().buscar(rs.getInt("genero_fil"));
                Filme filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("sinopse_fil"), genero, diretor, rs.getString("critica_fil"), rs.getInt("nota_fil"));
                lista.add(filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filmes: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public void remover(int cod) {
        String sql = "delete from filme where cod_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover filme: " + e.getMessage());
        }
    }

    @Override
    public List<Filme> listarPorGenero(int cod) {
        List<Filme> lista = null;
        String sql = "select * from filme where genero_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {

            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            lista = new ArrayList<>();
            while (rs.next()) {
                Diretor diretor = new DiretorDAO().buscar(rs.getInt("diretor_fil"));
                Genero genero = new GeneroDAO().buscar(rs.getInt("genero_fil"));
                Filme filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("sinopse_fil"), genero, diretor, rs.getString("critica_fil"), rs.getInt("nota_fil"));
                lista.add(filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filmes por genero: " + e.getMessage());
        }
        return lista;
    }

    @Override
    public List<Filme> listarPorNota(int nota) {
        List<Filme> lista = null;
        String sql = "select * from filme  where nota_fil = ?";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {

            pstm.setInt(1, nota);
            ResultSet rs = pstm.executeQuery();

            lista = new ArrayList<>();
            while (rs.next()) {
                Diretor diretor = new DiretorDAO().buscar(rs.getInt("diretor_fil"));
                Genero genero = new GeneroDAO().buscar(rs.getInt("genero_fil"));
                Filme filme = new Filme(rs.getInt("cod_fil"), rs.getString("nome_fil"), rs.getString("sinopse_fil"), genero, diretor, rs.getString("critica_fil"), rs.getInt("nota_fil"));
                lista.add(filme);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filmes por nota: " + e.getMessage());
        }
        return lista;
    }
}
