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
}
