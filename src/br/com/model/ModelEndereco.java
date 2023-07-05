/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

/**
 *
 * @author shuttxx
 */
public class ModelEndereco {
    private String RuaEndereco;
    private String NumeroEndereco;
    private String BairroEndereco;
    private double CepEndereco;
    private String CidadeEndereco;
    private String UfEndereco;

    public ModelEndereco(String RuaEndereco, String NumeroEndereco, String BairroEndereco, double CepEndereco, String CidadeEndereco, String UfEndereco) {
        this.RuaEndereco = RuaEndereco;
        this.NumeroEndereco = NumeroEndereco;
        this.BairroEndereco = BairroEndereco;
        this.CepEndereco = CepEndereco;
        this.CidadeEndereco = CidadeEndereco;
        this.UfEndereco = UfEndereco;
    }

    public String getRuaEndereco() {
        return RuaEndereco;
    }

    public void setRuaEndereco(String RuaEndereco) {
        this.RuaEndereco = RuaEndereco;
    }

    public String getNumeroEndereco() {
        return NumeroEndereco;
    }

    public void setNumeroEndereco(String NumeroEndereco) {
        this.NumeroEndereco = NumeroEndereco;
    }

    public String getBairroEndereco() {
        return BairroEndereco;
    }

    public void setBairroEndereco(String BairroEndereco) {
        this.BairroEndereco = BairroEndereco;
    }

    public double getCepEndereco() {
        return CepEndereco;
    }

    public void setCepEndereco(double CepEndereco) {
        this.CepEndereco = CepEndereco;
    }

    public String getCidadeEndereco() {
        return CidadeEndereco;
    }

    public void setCidadeEndereco(String CidadeEndereco) {
        this.CidadeEndereco = CidadeEndereco;
    }

    public String getUfEndereco() {
        return UfEndereco;
    }

    public void setUfEndereco(String UfEndereco) {
        this.UfEndereco = UfEndereco;
    }
}
