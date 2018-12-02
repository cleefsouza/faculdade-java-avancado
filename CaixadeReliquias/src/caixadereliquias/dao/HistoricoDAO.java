package caixadereliquias.dao;

import caixadereliquias.controller.IHistorico;
import caixadereliquias.model.Historico;
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
public class HistoricoDAO implements IHistorico {

    // recebe conexão
    Connection conn = null;

    // construtor
    public HistoricoDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }
    
    @Override
    public void registrarAcao(Historico historico) {
        String sql = "INSERT INTO historico(descricao_his, data_atualizacao_his, hora_atualizacao_his, usuario_his, colecao_his, colecionavel_his) VALUES(?,?,?,?,?,?);";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setString(1, historico.getDescricao_his());
            pstm.setString(2, historico.getData_atualizacao_his());
            pstm.setString(3, historico.getHora_atualizacao_his());
            pstm.setString(4, historico.getUsuario_his());
            pstm.setString(5, historico.getColecao_his());
            pstm.setString(6, historico.getColecionavel_his());
            pstm.execute();
        } catch (SQLException e) {
            System.err.println("Erro ao registrar ação: " + e.getMessage());
        }
    }
    
    @Override
    public List<Historico> listar() {
        List<Historico> lista = null;
        String sql = "SELECT * FROM historico ORDER BY cod_his DESC;";
        try (Statement stm = this.conn.createStatement();
                ResultSet rs = stm.executeQuery(sql)) {
            
            Historico historico;
            lista = new ArrayList<>();
            while (rs.next()) {
                historico = new Historico(rs.getInt("cod_his"), rs.getString("descricao_his"), rs.getString("hora_atualizacao_his"), rs.getString("data_atualizacao_his"), rs.getString("usuario_his"), rs.getString("colecao_his"), rs.getString("colecionavel_his"));
                
                lista.add(historico);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar historico: " + e.getMessage());
        }
        return lista;
    }
    
    @Override
    public List<Historico> listarRecentes(int lim) {
        List<Historico> lista = null;
        String sql = "SELECT * FROM historico ORDER BY cod_his DESC LIMIT ?;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            
            pstm.setInt(1, lim);
            ResultSet rs = pstm.executeQuery();
            
            Historico historico;
            lista = new ArrayList<>();
            while (rs.next()) {
                historico = new Historico(rs.getInt("cod_his"), rs.getString("descricao_his"), rs.getString("hora_atualizacao_his"), rs.getString("data_atualizacao_his"), rs.getString("usuario_his"), rs.getString("colecao_his"), rs.getString("colecionavel_his"));
                
                lista.add(historico);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar historico recente: " + e.getMessage());
        }
        return lista;
    }
}
