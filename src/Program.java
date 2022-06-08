import entities.Atendimento;
import entities.Pessoa;
import entities.subclasses.Paciente;
import entities.subclasses.Profissional;

public class Program {

    public static void main(String[] args) {

        //Instanciação de pessoas
        Pessoa p1 = new Pessoa (1, 74, "Ronaldo", "Carvalho", "798465132-45", "(32)94652-7945", "NA" );
        System.out.println(p1);

        Pessoa p2 = new Pessoa (2, 58, "Antônio", "Gomes", "456321789-42", "(11)1234-6543", "antonio@email.com");
        System.out.println(p2);

        Pessoa p3 = new Pessoa (3, 17, "Helena Maria", "Santos", "978465132-12", "(37)94657-1345","mariahelena@email.com");
        System.out.println(p3);


        //Intanciação de pacientes e utilização de métodos personalizados
        Paciente pac1 = new Paciente(1, 74, "Ronaldo", "Carvalho", "798465132-45", "(32)94652-7945","NA", "febre. dificuldade para respirar", "NA", "glifage, atorvastatina, clenil, captopril", "prostata", true, false, true);
        System.out.println(pac1);
        pac1.priorizarAtendimento(true);
        pac1.temConvenio();


        Paciente pac2 = new Paciente(2, 58, "Antônio", "Gomes", "456321789-42", "(11)1234-6543", "antonio@email.com", "dor no peito, formigamento na mão esquerda", "NA", "AAS, losartana", "NA", true, true, false);
        System.out.println(pac2);
        pac2.priorizarAtendimento(false);
        pac2.temConvenio();


        Paciente pac3 = new Paciente(3, 17, "Helena Maria", "Santos", "978465132-12", "(37)94657-1345", "mariahelena@email.com", "vômito", "AAS", "NA", "NA", false, false, true);
        System.out.println(pac3);
        pac3.priorizarAtendimento(false);
        pac3.temConvenio();


        Paciente pac4 = new Paciente(4, 39, "José Carlos", "Gomes Pereira", "132465798-32", "(17)92738-2049", "jose@email.com", "diabetes descompensada", "NA", "Insulina NPH, Insulina Regular", "NA", false, true, false);
        System.out.println(pac4);
        pac4.priorizarAtendimento(true);
        pac4.temConvenio();


        Paciente pac5 = new Paciente(1, 56, "Maria", "Josefina", "123456789-98", "(11)9876-5432", "ms@email.com", "cefaleia", "NA", "NA", "endometriose", true, true, true);
        System.out.println(pac5);
        pac5.priorizarAtendimento(false);
        pac5.temConvenio();


        // Instanciação de Profissionais e utilização de métodos personalizados
        Profissional med1 = new Profissional(1, 28, "Otávio", "Costa", "456789123-87", "(31)9876-1234", "otavio@email.com", "CRM 123.456");
        med1.obterEspecialidade("medico(a)");


        Profissional enf1 = new Profissional(2, 29, "Ana Clara", "Ramos", "321654789-12", "(31)9786-1425", "anaclara@email.com", "COREN 321.654");
        enf1.obterEspecialidade("enfermagem");


        Profissional nut1 = new Profissional(3, 35, "Erica", "Vilaça", "132465978-21", "(32)79865-4312", "erica@email.com", "CRN 79.124");
        nut1.obterEspecialidade("nutrição");


        Profissional fis1 = new Profissional(4, 38, "Henrique", "Soares Santos", "798646123-49", "(11)79845-1345", "henrique@email.com", "CREFITO 745.794");
        fis1.obterEspecialidade("fisioterapia");


        Profissional lab1 = new Profissional(5, 47, "Caroline", "Rodrigues", "798132465-79", "(21)4978-1353", "carol@email.com", "COREN 132.456.74");
        lab1.obterEspecialidade("laboratório");


        //Instanciação de atendimentos e utilização de métodos personalizados
        Atendimento atend1 = new Atendimento(1, 1234, "Hospital São Luiz", "18/06/2022", "Tomografia", pac4, enf1);
        Atendimento atend2 = new Atendimento(2, 3216, "Hospital Carlos Chagas", "11/06/2022", "Internação", pac5, nut1);
        Atendimento atend3 = new Atendimento(3, 7894, "Hospital das Clínicas", "08/06/2022", "Hemodinâmica", pac2, med1);
        Atendimento atend4 = new Atendimento(4, 4375, "Hospital das Clínicas", "10/06/2022", "Ambulatório", pac1, fis1);
        Atendimento atend5 = new Atendimento(5, 7745, "Hospital São Luiz", "08/06/2022", "Laboratório", pac3, lab1);


        atend1.obterAtendimento();
        atend2.obterAtendimento();
        atend3.obterAtendimento();
        atend4.obterAtendimento();
        atend5.obterAtendimento();

        //Retorno das informações de todos os pacientes, profissionais e atendimentos realizados/agendados
        System.out.println(atend1);
        System.out.println(atend2);
        System.out.println(atend3);
        System.out.println(atend4);
        System.out.println(atend5);

    }
}
