package entities;

import entities.subclasses.Paciente;
import entities.subclasses.Profissional;

public class Atendimento {

    private int id, numeroProntuario;
    private String nomeEstabelecimento, dataAgendamento, setor;
    private Paciente paciente;
    private Profissional profissional;



    // CONSTRUCTOR
    public Atendimento() {
    }

    public Atendimento(int id, int numeroProntuario, String nomeEstabelecimento, String dataAgendamento, String setor, Paciente paciente, Profissional profissional) {
        this.id = id;
        this.numeroProntuario = numeroProntuario;
        this.nomeEstabelecimento = nomeEstabelecimento;
        this.dataAgendamento = dataAgendamento;
        this.setor = setor;
        this.paciente = paciente;
        this.profissional = profissional;
    }

    //GETTER AND SETTER

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumeroProntuario() {
        return numeroProntuario;
    }

    public void setNumeroProntuario(int numeroProntuario) {
        this.numeroProntuario = numeroProntuario;
    }

    public String getNomeEstabelecimento() {
        return nomeEstabelecimento;
    }

    public void setNomeEstabelecimento(String nomeEstabelecimento) {
        this.nomeEstabelecimento = nomeEstabelecimento;
    }

    public String getDataAgendamento() {
        return dataAgendamento;
    }

    public void setDataAgendamento(String dataAgendamento) {
        this.dataAgendamento = dataAgendamento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Profissional getProfissional() {
        return profissional;
    }

    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }


    //MÉTODOS PERSONALIZADOS
    public void obterAtendimento() {
        System.out.println("Profissional: " + getProfissional() + "está atendendo o paciente: " + getPaciente() + " .");
    }


    //TO STRING

    @Override
    public String toString() {
        return "Atendimento{" +
                "id=" + id +
                ", numeroProntuario=" + numeroProntuario +
                ", nomeEstabelecimento='" + nomeEstabelecimento + '\'' +
                ", dataAgendamento='" + dataAgendamento + '\'' +
                ", setor='" + setor + '\'' +
                ", paciente=" + paciente +
                ", profissional=" + profissional +
                '}';
    }
}
