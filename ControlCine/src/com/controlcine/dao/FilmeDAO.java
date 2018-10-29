package com.controlcine.dao;

import com.controlcine.model.ClassificacaoENUM;
import com.controlcine.model.Diretor;
import com.controlcine.model.Filme;
import com.controlcine.model.GeneroENUM;
import com.controlcine.model.IdiomaENUM;
import com.controlcine.model.Produtora;
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
public class FilmeDAO {

    Connection con = null;

    public FilmeDAO() {
        this.con = new com.controlcine.connection.Conexao().getConexao(); // Estabelecendo conexão
    }

    // Inserir
    public void inserirFilme(Filme filme) {
        String sql = "INSERT INTO filme (filNome, filDuracao, filAnoLancamento, filDiretor, filProdutora, filIdioma, filClassificacao, filGenero) VALUES (?, ?, ?, ?, ?, ?, ?, ?);";
        try (PreparedStatement pstm = this.con.prepareStatement(sql)) {
            pstm.setString(1, filme.getFilNome());
            pstm.setString(2, filme.getFilDuracao());
            pstm.setDate(3, filme.getFilAnoLancamento());
            pstm.setInt(4, filme.getFilDiretor().getDirCod());
            pstm.setInt(5, filme.getFilProdutora().getProCod());
            pstm.setString(6, filme.getFilIdioma().toString());
            pstm.setString(7, filme.getFilClassificacao().toString());
            pstm.setString(8, filme.getFilGenero().toString());

            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao inserir filme: " + e.getMessage());
        }
    }

    // Listar
    public List<Filme> listarFilmes() {
        List<Filme> lista = null;
        String sql = "SELECT * FROM filme f, produtora p, diretor d WHERE f.filDiretor = d.dirCod AND f.filProdutora = p.proCod;";
        try (Statement stm = this.con.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            Filme fil;
            Diretor dir;
            Produtora pro;

            lista = new ArrayList<>();
            while (rs.next()) {
                fil = new Filme();
                fil.setFilCod(rs.getInt("filCod"));
                fil.setFilNome(rs.getString("filNome"));
                fil.setFilDuracao(rs.getString("filDuracao"));
                fil.setFilAnoLancamento(rs.getDate("filAnoLancamento"));
                fil.setFilIdioma(Enum.valueOf(IdiomaENUM.class, rs.getString("filIdioma")));
                fil.setFilClassificacao(Enum.valueOf(ClassificacaoENUM.class, rs.getString("filClassificacao")));
                fil.setFilGenero(Enum.valueOf(GeneroENUM.class, rs.getString("filGenero")));

                dir = new Diretor();
                dir.setDirCod(rs.getInt("dirCod"));
                dir.setDirNome(rs.getString("dirNome"));
                fil.setFilDiretor(dir);

                pro = new Produtora();
                pro.setProCod(rs.getInt("proCod"));
                pro.setProNome(rs.getString("proNome"));
                fil.setFilProdutora(pro);

                lista.add(fil);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filmes: " + e.getMessage());
        }
        return lista;
    }

    // Remover
    public void removerFilme(String filNome) {
        String sql = "DELETE FROM filme WHERE filNome = ?";
        try (PreparedStatement pstm = this.con.prepareStatement(sql)) {
            pstm.setString(1, filNome);
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao remover filme: " + e.getMessage());
        }
    }

    // Atualizar
    public void atualizarFilme(Filme filme) {
        String sql = "UPDATE filme SET filNome = ?, filDuracao = ?, filAnoLancamento = ?, filDiretor = ?, filProdutora = ?, filIdioma = ?, filClassificacao = ?, filGenero = ? WHERE filNome = ?;";
        try (PreparedStatement pstm = this.con.prepareStatement(sql)) {
            pstm.setString(1, filme.getFilNome());
            pstm.setString(2, filme.getFilNome());
            pstm.setString(3, filme.getFilDuracao());
            pstm.setDate(4, filme.getFilAnoLancamento());
            pstm.setInt(5, filme.getFilDiretor().getDirCod());
            pstm.setInt(6, filme.getFilProdutora().getProCod());
            pstm.setString(7, filme.getFilIdioma().toString());
            pstm.setString(8, filme.getFilClassificacao().toString());
            pstm.setString(9, filme.getFilGenero().toString());

            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao atualizar filme: " + e.getMessage());
        }
    }
}