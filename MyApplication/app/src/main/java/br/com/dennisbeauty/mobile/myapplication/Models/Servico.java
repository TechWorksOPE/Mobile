package br.com.dennisbeauty.mobile.myapplication.Models;

import java.sql.Time;

public class Servico {

    public int getIdServico() {
        return idServico;
    }

    public void setIdServico(int idServico) {
        this.idServico = idServico;
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Time getTempoExecucao() {
        return tempoExecucao;
    }

    public void setTempoExecucao(Time tempoExecucao) {
        this.tempoExecucao = tempoExecucao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    private int idServico;
    private String nome ;
    private Time tempoExecucao;
    private String descricao;

}
