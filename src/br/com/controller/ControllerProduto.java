/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.controller;

import br.com.conexao.ModelConexao;
import br.com.model.ModelProduto;
import br.com.telas.AddProduto;
import br.com.telas.CadProduto;
import br.com.telas.ListProd;
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
public class ControllerProduto {

    Uteis uteis = new Uteis();
    private PreparedStatement pst = null;
    private final ResultSet rs = null;
    private CadProduto cadp;
    private ListProd list;
    private AddProduto addpro;

    public ControllerProduto(CadProduto cadp) {
        this.cadp = cadp;
    }

    public ControllerProduto(ListProd list) {
        this.list = list;
    }
    
    public ControllerProduto(AddProduto addprod) {
        this.addpro = addprod;
    }

    public ResultSet ultimoElemento() throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "SELECT MAX(id_produto) + 1 FROM produto;";
        try {
            pst = con.prepareStatement(SQL);
            return pst.executeQuery();

        } catch (SQLException e) {
            return null;

        }
    }

    public void adicionar(ModelProduto produto) throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "insert into produto("
                + "nome_produto, "
                + "descricao,"
                + " marca, "
                + "preco)"
                + "values(?, ?, ?, ?);";

        try {
            String preco = Uteis.removePontos(produto.getPreco());

            pst = con.prepareStatement(SQL);

            pst.setString(1, produto.getNome_produto());
            pst.setString(2, produto.getDescricao());
            pst.setString(3, produto.getMarca());
            pst.setDouble(4, Double.parseDouble(preco.replaceAll(",", ".")));

            pst.execute();

            ModelConexao.fechaConexao(con);

            JOptionPane.showMessageDialog(cadp, 
                    "Adicionado com Sucesso", 
                    "Sucesso", 
                    JOptionPane.INFORMATION_MESSAGE);

            uteis.limparCampos(cadp.Descricao);
            uteis.limparCampos(cadp.Produto);
            uteis.limparCampos(cadp.txtDescricaoProd);
            cadp.ultimo();

        } catch (NumberFormatException | SQLException sql) {
            JOptionPane.showMessageDialog(cadp, 
                    sql);
            JOptionPane.showMessageDialog(cadp, 
                    "Erro ao Adicionar no Banco", 
                    "Erro", 
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    public ResultSet listaTudo() throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "SELECT "
                + "id_produto AS Id, "
                + "nome_produto AS Produto, "
                + "descricao AS Descricao, "
                + "marca AS Marca, "
                + "preco AS Preco "
                + "FROM produto;";

        try {
            pst = con.prepareStatement(SQL);
            return pst.executeQuery();

        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(cadp, sql);
            JOptionPane.showMessageDialog(cadp, "Erro ao Adicionar no Banco", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return null;
    }

    public ResultSet pesquisarProd(ModelProduto produto) throws SQLException {
        Connection con = ModelConexao.conector();
        String SQL = "SELECT "
                + "id_produto AS Id, "
                + "nome_produto AS Produto, "
                + "descricao AS Descricao, "
                + "marca AS Marca, preco "
                + "AS Preco "
                + "FROM produto "
                + "WHERE id_produto LIKE ? "
                + "AND nome_produto LIKE ? "
                + "AND marca LIKE ?;";

        try {
            pst = con.prepareStatement(SQL);

            pst.setString(1, produto.getId_produto() + "%");
            pst.setString(2, produto.getNome_produto() + "%");
            pst.setString(3, produto.getMarca() + "%");
            return pst.executeQuery();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(cadp, e);
        }
        return null;
    }

}
