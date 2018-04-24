package br.com.dennisbeauty.mobile.myapplication.Models;

import java.util.Date;

public class Agendamento {

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Servico getServico() {
        return servico;
    }

    public void setServico(Servico servico) {
        this.servico = servico;
    }

    public Date getHorarioAgendamento() {
        return horarioAgendamento;
    }

    public void setHorarioAgendamento(Date horarioAgendamento) {
        this.horarioAgendamento = horarioAgendamento;
    }

    public int getIdAgendamento() {
        return IdAgendamento;
    }

    public void setIdAgendamento(int idAgendamento) {
        IdAgendamento = idAgendamento;
    }

    private int IdAgendamento;
    private Cliente cliente;
     private Funcionario funcionario;
     private Servico servico;
     private Date horarioAgendamento;


}
