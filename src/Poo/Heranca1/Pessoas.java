package Poo.Heranca1;

public class Pessoas {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("pedro");
        p2.setNome("lucas");
        p3.setNome("newt");
        p4.setNome("icaro");

        p2.setIdade(17);
        p3.setSexo("masculino");

        p1.toString();
        p2.toString();
        p3.toString();
        p4.toString();

    }


}
