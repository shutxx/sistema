/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.conexao.ModelConexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author shuttxx
 */
public class ControllerCidade {

    private PreparedStatement pst = null;
    private final ResultSet rs = null;

    public ResultSet listarCidades() throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "select * from cidade order by cidade;";
        try {
            pst = con.prepareStatement(SQL);
            return pst.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
