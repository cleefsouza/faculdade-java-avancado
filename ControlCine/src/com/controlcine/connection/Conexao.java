package com.controlcine.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cleefsouza
 */
public class Conexao {

    Connection con = null;

    public Connection getConexao() {
        try {
            String url = "jdbc:sqlite:C:/sqlite/controlcine.db"; // URL database

            // Criando conexão
            this.con = DriverManager.getConnection(url);
            System.out.println("Conexão com sqlite estabelecida.");

        } catch (SQLException e) {
            System.err.println("Erro ao estabelecer conexão.\n" + e.getMessage());
        }
        return this.con;
    }

}
