package caixadereliquias.dao;

import caixadereliquias.controller.IHistorico;
import caixadereliquias.model.Colecao;
import caixadereliquias.model.Colecionavel;
import caixadereliquias.model.Historico;
import caixadereliquias.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author cleefsouza
 */
public class HistoricoDAO implements IHistorico {

    // recebe conexão
    Connection conn = null;

    // construtor
    HistoricoDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void registrarAcao(Historico historico) {
        String sql = "INSERT INTO historico(descricao_his, data_atualizacao_his, hora_atualizacao_his, usuario_his, colecao_his, colecionavel_his) VALUES(?,?,?,?,?,?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, historico.getDescricao_his());
            pstm.setDate(2, (java.sql.Date) historico.getData_atualizacao_his());
            pstm.setTimestamp(3, historico.getHora_atualizacao_his());
            pstm.setInt(4, historico.getUsuario_his().getCod_usu());
            pstm.setInt(5, historico.getColecao_his().getCod_col());
            pstm.setInt(6, historico.getColecionavel_his().getCod_cole());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao registrar ação: " + e.getMessage());
        }
    }

    @Override
    public List<Object> listarPorData(Date data) {
        List<Object> lista = null;
        String sql = "SELECT * FROM historico;";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {

            Object historico;
            Usuario usuario;
            Colecao colecao;
            Colecionavel colecionavel;
            lista = new ArrayList<>();
            while (rs.next()) {
                usuario = (Usuario) new UsuarioDAO().buscar(rs.getInt("usuario_his"));
                colecao = (Colecao) new ColecaoDAO().buscar(rs.getInt("colecao_his"));
                colecionavel = (Colecionavel) new ColecionavelDAO().buscar(rs.getInt("colecionavel_his"));
                historico = new Historico(rs.getInt("cod_his"), rs.getString("descricao_his"), rs.getTimestamp("hora_atualizacao_his"), rs.getDate("data_atualizacao_his"), usuario, colecao, colecionavel);

                lista.add((Historico) historico);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar filme: " + e.getMessage());
        }
        return lista;
    }
}
