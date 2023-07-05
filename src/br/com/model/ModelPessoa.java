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
    private String Pessoanome;
    private String PessoaCPF;
    private String PessoaTele;
    private String PessoaEmail;
    private ModelEndereco PesssoaEndereco;

    public ModelPessoa(String Pessoanome, String PessoaCPF, String PessoaTele, String PessoaEmail, ModelEndereco PesssoaEndereco) {
        this.Pessoanome = Pessoanome;
        this.PessoaCPF = PessoaCPF;
        this.PessoaTele = PessoaTele;
        this.PessoaEmail = PessoaEmail;
        this.PesssoaEndereco = PesssoaEndereco;
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

    public ModelEndereco getPesssoaEndereco() {
        return PesssoaEndereco;
    }

    public void setPesssoaEndereco(ModelEndereco PesssoaEndereco) {
        this.PesssoaEndereco = PesssoaEndereco;
    }
}
