/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;


/**
 *
 * @author shuttxx
 */
public class ModelAuxiliar {

    private String id;
    private String produto;
    private String quantidade;
    private String preco;
    private String TotPreco;

    public String getTotPreco() {
        return TotPreco;
    }

    public void setTotPreco(String TotPreco) {
        this.TotPreco = TotPreco;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(String quantidade) {
        this.quantidade = quantidade;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

}
