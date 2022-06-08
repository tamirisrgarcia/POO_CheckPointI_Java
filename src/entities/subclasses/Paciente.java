package entities.subclasses;

import entities.Pessoa;

public class Paciente extends Pessoa {

    private String sintoma, alergia, medicacaoConstante, cirurgia;
    private boolean tabagismo, alcoolismo;
    private boolean convenio;


    //CONSTRUCTOR
    public Paciente(int id, int idade, String nome, String sobrenome, String cpf, String telefone, String email, String sintoma, String alergia, String medicacaoConstante, String cirurgia, boolean tabagismo, boolean alcoolismo, boolean convenio) {
        super(id, idade, nome, sobrenome, cpf, telefone, email);
        this.sintoma = sintoma;
        this.alergia = alergia;
        this.medicacaoConstante = medicacaoConstante;
        this.cirurgia = cirurgia;
        this.tabagismo = tabagismo;
        this.alcoolismo = alcoolismo;
        this.convenio = convenio;
    }

    //GETTER AND SETTER
    public String getSintoma() {
        return sintoma;
    }

    public void setSintoma(String sintoma) {
        this.sintoma = sintoma;
    }

    public String getAlergia() {
        return alergia;
    }

    public void setAlergia(String alergia) {
        this.alergia = alergia;
    }

    public String getMedicacaoConstante() {
        return medicacaoConstante;
    }

    public void setMedicacaoConstante(String medicacaoConstante) {
        this.medicacaoConstante = medicacaoConstante;
    }

    public String getCirurgia() {
        return cirurgia;
    }

    public void setCirurgia(String cirurgia) {
        this.cirurgia = cirurgia;
    }

    public boolean isTabagismo() {
        return tabagismo;
    }

    public void setTabagismo(boolean tabagismo) {
        this.tabagismo = tabagismo;
    }

    public boolean isAlcoolismo() {
        return alcoolismo;
    }

    public void setAlcoolismo(boolean alcoolismo) {
        this.alcoolismo = alcoolismo;
    }


    //MÉTODOS PERSONALIZADOS
    public void priorizarAtendimento(boolean prioridade) {
        if(prioridade) {
            System.out.println("Paciente " +getNome() + " tem prioridade no atendimento");
        } else {
            System.out.println(getNome() + ",favor aguardar atendimento");
        }
    }

    public void temConvenio() {
        if(convenio) {
            System.out.println("Paciente " + getNome() + " possui convênio");
        } else {
            System.out.println("Paciente " + getNome() + " não possui convênio. O valor da consulta é R$200,00");
        }
    }


    //TO STRING
    @Override
    public String toString() {
        return super.toString() +
                "sintoma='" + sintoma + '\'' +
                ", alergia='" + alergia + '\'' +
                ", medicacaoConstante='" + medicacaoConstante + '\'' +
                ", cirurgia='" + cirurgia + '\'' +
                ", tabagismo=" + tabagismo +
                ", alcoolismo=" + alcoolismo +
                ", convenio=" + convenio +
                '}';
    }
}
