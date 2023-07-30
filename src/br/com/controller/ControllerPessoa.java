/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.conexao.ModelConexao;
import br.com.model.ModelPessoa;
import br.com.telas.CadPessoa;
import br.com.telas.Clientes;
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
public class ControllerPessoa {

    Uteis uteis = new Uteis();
    private PreparedStatement pst = null;
    private final ResultSet rs = null;
    private CadPessoa cadp;
    private Clientes cliente;

    public ControllerPessoa(CadPessoa cad) {
        this.cadp = cad;
    }

    public ControllerPessoa(Clientes cli) {
        this.cliente = cli;
    }

    public ResultSet ultimoElemento() throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "SELECT MAX(id_pessoa) + 1 FROM pessoapadrao;";
        try {
            pst = con.prepareStatement(SQL);
            return pst.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(cadp, e);
            JOptionPane.showMessageDialog(cadp, "Erro ao Adicionar no Banco", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        ModelConexao.fechaConexao(con);
        return null;
    }

    public void adicionar(ModelPessoa pessoa) throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "insert into pessoapadrao(nome_pessoa, cpf, telefone, email, id_cidade, rua, numero, bairro, cep)"
                + "values(?, ?, ?, ?, ?, ?, ?, ?, ?);";

        try {
            pst = con.prepareStatement(SQL);

            pst.setString(1, pessoa.getPessoanome());
            pst.setString(2, pessoa.getPessoaCPF());
            pst.setString(3, pessoa.getPessoaTele());
            pst.setString(4, pessoa.getPessoaEmail());
            pst.setInt(5, pessoa.getIdCidade());
            pst.setString(6, pessoa.getRua());
            pst.setString(7, pessoa.getNumero());
            pst.setString(8, pessoa.getBairro());
            pst.setString(9, pessoa.getCep());

            pst.execute();

            ModelConexao.fechaConexao(con);

            JOptionPane.showMessageDialog(cadp, "Adicionado com Sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);

            uteis.limparCampos(cadp.Endereco);
            uteis.limparCampos(cadp.Pessoa);
            cadp.Ultimo();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(cadp, e);
            JOptionPane.showMessageDialog(cadp, "Erro ao Adicionar no Banco", "Erro", JOptionPane.ERROR_MESSAGE);

        }
        ModelConexao.fechaConexao(con);
    }

    public ResultSet listaPessoas() throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "SELECT id_pessoa as Id, nome_pessoa as Nome FROM pessoapadrao;";

        try {

            pst = con.prepareStatement(SQL);
            return pst.executeQuery();

        } catch (SQLException sql) {

            JOptionPane.showMessageDialog(cadp, sql);
            JOptionPane.showMessageDialog(cadp, "Erro ao Buscar no Banco", "Erro", JOptionPane.ERROR_MESSAGE);

        }
        ModelConexao.fechaConexao(con);
        return null;
    }
}
