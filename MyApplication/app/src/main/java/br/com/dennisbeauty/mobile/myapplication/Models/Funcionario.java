package br.com.dennisbeauty.mobile.myapplication.Models;

public class Funcionario {

    public int getIdFuncionario() {
        return idFuncionario;
    }

    public void setIdFuncionario(int idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    private int idFuncionario;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String[] getServico() {
        return servico;
    }

    public void setServico(String[] servico) {
        this.servico = servico;
    }

    private String nome;
    private String cargo ;
    private String [] servico ;

}
