/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.telas.Menu;
import java.awt.HeadlessException;
import static java.awt.image.ImageObserver.HEIGHT;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import br.com.model.ModelUser;
import br.com.telas.Login;
import br.com.conexao.ModelConexao;

/**
 *
 * @author shuttxx
 */
public class ControllerUser {

    private final Login login;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    public ControllerUser(Login login) {
        this.login = login;
    }

    public void check(ModelUser usuario) throws SQLException {
        Connection con = ModelConexao.conector();
        String sql = "select * from usuario where login=? and senha=?";
        try {
            pst = con.prepareStatement(sql);
            pst.setString(1, usuario.getLoginUser());
            pst.setString(2, usuario.getSenhaUser());
            rs = pst.executeQuery();
            if (rs.next()) {
                String perfil = rs.getString(5);
                if (perfil.equals("admin")) {
                    Menu menu = new Menu();
                    menu.setVisible(true);
                    Menu.menuFinan.setEnabled(true);
                    ModelConexao.fechaConexao(con);
                    login.dispose();
                } else {
                    Menu menu = new Menu();
                    menu.setVisible(true);
                    ModelConexao.fechaConexao(con);
                    login.dispose();
                }
            } else {
                JOptionPane.showMessageDialog(login, "Usuario ou senha errado", "Erro", HEIGHT);
            }
        } catch (HeadlessException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
