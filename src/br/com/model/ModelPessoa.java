/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.model;

/**
 *
 * @author shuttxx
 */
public class ModelPessoa {

    private int IdPessoa;
    private String Pessoanome;
    private String PessoaCPF;
    private String PessoaTele;
    private String PessoaEmail;
    private int IdCidade;
    private String rua;
    private String numero;
    private String bairro;
    private String cep;

    public int getIdPessoa() {
        return IdPessoa;
    }

    public void setIdPessoa(int IdPessoa) {
        this.IdPessoa = IdPessoa;
    }

    public String getPessoanome() {
        return Pessoanome;
    }

    public void setPessoanome(String Pessoanome) {
        this.Pessoanome = Pessoanome;
    }

    public String getPessoaCPF() {
        return PessoaCPF;
    }

    public void setPessoaCPF(String PessoaCPF) {
        this.PessoaCPF = PessoaCPF;
    }

    public String getPessoaTele() {
        return PessoaTele;
    }

    public void setPessoaTele(String PessoaTele) {
        this.PessoaTele = PessoaTele;
    }

    public String getPessoaEmail() {
        return PessoaEmail;
    }

    public void setPessoaEmail(String PessoaEmail) {
        this.PessoaEmail = PessoaEmail;
    }

    public int getIdCidade() {
        return IdCidade;
    }

    public void setIdCidade(int IdCidade) {
        this.IdCidade = IdCidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }
}
