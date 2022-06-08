package entities.subclasses;

import entities.Pessoa;

public class Profissional extends Pessoa {

    private String conselhoProfissional;


    //CONSTRUCTOR
    public Profissional(int id, int idade, String nome, String sobrenome, String cpf, String telefone, String email, String conselhoProfissional) {
        super(id, idade, nome, sobrenome, cpf, telefone, email);
        this.conselhoProfissional = conselhoProfissional;
    }


    //GETTER AND SETTER
    public String getConselhoProfissional() {
        return conselhoProfissional;
    }

    public void setConselhoProfissional(String conselhoProfissional) {
        this.conselhoProfissional = conselhoProfissional;
    }


    //MÉTODOS PERSONALIZADOS
    public void obterEspecialidade(String especialidade) {
        if(especialidade == "medico(a)") {
            System.out.println(getNome() + " é profissional médico(a)");
        } else if(especialidade == "enfermagem") {
            System.out.println(getNome() + " é profissional da enfermagem");
        } else if(especialidade == "laboratório") {
            System.out.println(getNome() + " é profissional do laboratório");
        } else if(especialidade == "fisioterapia") {
            System.out.println(getNome() + " é profissional da fisioterapia");
        } else if(especialidade == "nutrição") {
            System.out.println(getNome() + " é profissional da nutrição");
        } else {
            System.out.println("Área profissional não identificada");
        }
    }


    @Override
    public String toString() {
        return super.toString() +
                ", conselhoProfissional='" + conselhoProfissional + '\'' +
                '}';
    }
}
