/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.conexao.ModelConexao;
import br.com.model.ModelFuncionario;
import br.com.telas.CadFuncionario;
import br.com.util.Uteis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author shuttxx
 */
public class ControllerFuncionario {

    Uteis uteis = new Uteis();
    private PreparedStatement pst = null;
    private final ResultSet rs = null;
    private final CadFuncionario cad;

    public ControllerFuncionario(CadFuncionario cad) {
        this.cad = cad;
    }

    public ResultSet ultimoElemento() throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "SELECT MAX(id_funcionario) + 1 FROM Funcionario;";
        try {
            pst = con.prepareStatement(SQL);
            return pst.executeQuery();

        } catch (SQLException e) {
            return null;

        }
    }

    public void adicionarFun(ModelFuncionario func) throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "insert into funcionario(nome_funcionario, cpf, telefone, email, id_cidade, rua, numero, bairro, cep, salario, cargo)"
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            String salario = Uteis.removePontos(func.getSalario());            

            pst = con.prepareStatement(SQL);

            pst.setString(1, func.getPessoanome());
            pst.setString(2, func.getPessoaCPF());
            pst.setString(3, func.getPessoaTele());
            pst.setString(4, func.getPessoaEmail());
            pst.setInt(5, func.getIdCidade());
            pst.setString(6, func.getRua());
            pst.setString(7, func.getNumero());
            pst.setString(8, func.getBairro());
            pst.setString(9, func.getCep());
            pst.setDouble(10, Double.parseDouble(salario.replaceAll(",", ".")));
            pst.setString(11, func.getCargo());

            pst.execute();

            ModelConexao.fechaConexao(con);

            JOptionPane.showMessageDialog(cad, "Adicionado com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            uteis.limparCampos(cad.Enderecof);
            uteis.limparCampos(cad.Pessoaf);
            uteis.limparCampos(cad.Funcionario);
            cad.Ultimo();

        } catch (NumberFormatException | SQLException sql) {
            JOptionPane.showMessageDialog(cad, sql);
            JOptionPane.showMessageDialog(cad, "Erro ao Adicionar no Banco", "Erro", JOptionPane.ERROR_MESSAGE);

        }
    }
}
