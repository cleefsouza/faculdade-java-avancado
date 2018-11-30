/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caixadereliquias.dao;

import caixadereliquias.controller.IPadrao;
import caixadereliquias.model.Estado;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author aclee
 */
public class EstadoDAO implements IPadrao {

    // recebe conexão
    Connection conn = null;

    // construtor
    EstadoDAO() {
        // recebe conexão
        this.conn = new caixadereliquias.factoryconnection.Conexao().getConnection();
    }

    @Override
    public void remover(int cod) {
        // o estado não pode ser removido
    }

    @Override
    public Object buscar(int cod) {
        Object estado = null;
        String sql = "SELECT * FROM estado WHERE cod_est;";
        try (PreparedStatement pstm = this.conn.prepareStatement(sql)) {
            pstm.setInt(1, cod);
            ResultSet rs = pstm.executeQuery();

            while (rs.next()) {
                estado = new Estado(rs.getInt("cod_est"), rs.getString("descricao_est"));
            }
        } catch (SQLException e) {
            System.err.println("Erro ao buscar estado: " + e.getMessage());
        }
        return estado;
    }

    @Override
    public List listar() {
        List<Object> lista = null;
        String sql = "SELECT * FROM estado";
        try (Statement pstm = this.conn.createStatement();
                ResultSet rs = pstm.executeQuery(sql)) {

            Object estado;
            lista = new ArrayList<>();
            while (rs.next()) {
                estado = new Estado(rs.getInt("cod_est"), rs.getString("descricao_est"));
                lista.add((Estado) estado);
            }
        } catch (SQLException e) {
            System.err.println("Erro ao listar estados: " + e.getMessage());
        }
        return lista;
    }
}
