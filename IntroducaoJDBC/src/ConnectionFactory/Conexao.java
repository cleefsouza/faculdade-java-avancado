/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author cleefsouza
 */

public class Conexao {

    public Connection getConnection() throws SQLException { // Metodo para criar uma conexão com o banco de dados
        Connection con = null; // Recebe a conexão

        try {
            Class.forName("java.sql.Driver"); // Drive do SGBD
            con = DriverManager.getConnection("jdbc:postgresql://localhost/introducao_jdbc", "seu_usuário", "sua_senha"); // Conexão com a base de dados
        } catch (ClassNotFoundException cnf_ex) { // Tratamento de exceção
            System.err.println("Erro de conexão: " + cnf_ex.getMessage()); // Mensagem no console
            JOptionPane.showMessageDialog(null, "Conexão não encontrada ...", "Erro: ClassNotFoundException", JOptionPane.ERROR_MESSAGE); // Mensagem para o usuário
        } catch (SQLException cnf_ex) { // Tratamento de exceção
            System.err.println("Erro de conexão: " + cnf_ex.getMessage()); // Mensagem no console
            JOptionPane.showMessageDialog(null, "Conexão não encontrada ...", "Erro: ClassNotFoundException", JOptionPane.ERROR_MESSAGE); // Mensagem para o usuário
        }

        return con;
    }

}
