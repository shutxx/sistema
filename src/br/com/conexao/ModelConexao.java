/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.conexao;

import java.sql.*;

/**
 *
 * @author shuttxx
 */
public class ModelConexao {

    public static Connection conector() throws SQLException {
        java.sql.Connection conexao = null;
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/teste";
        String user = "root";
        String password = "root";
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (Exception e) {
            throw new SQLException("Error establishing database connection: " + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Fechada a conexão com o banco de dados");
            }

        } catch (Exception e) {
            System.out.println("Não foi possível fechar a conexão com o banco de dados" + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement stmt) {
        try {
            if (conn != null) {
                fechaConexao(conn);
            }
            if (stmt != null) {
                stmt.close();
                System.out.println("Statement fechado com sucesso");
            }

        } catch (Exception e) {
            System.out.println("Não foi possível fechar o statement" + e.getMessage());
        }
    }

    public static void fechaConexao(Connection conn, PreparedStatement stmt, ResultSet rs) {
        try {
            if (conn != null || stmt != null) {
                fechaConexao(conn, stmt);
            }
            if (rs != null) {
                rs.close();
                System.out.println("ResultSet fechado com sucesso");
            }

        } catch (Exception e) {
            System.out.println("Não foi possível fechar o ResultSet" + e.getMessage());
        }
    }
}
