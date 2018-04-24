package br.com.dennisbeauty.mobile.myapplication.Models;

import java.sql.Time;

public class Agenda {

    public int getIdAgenda() {
        return IdAgenda;
    }

    public void setIdAgenda(int idAgenda) {
        IdAgenda = idAgenda;
    }

    public Time[] getListaHorarios(int idAgenda) {

        return ListaHorarios;
    }

    public void setListaHorarios(Time[] listaHorarios) {
        ListaHorarios = listaHorarios;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }


    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    private int IdAgenda;
    private Time [] ListaHorarios ;
    private Funcionario funcionario;
}
