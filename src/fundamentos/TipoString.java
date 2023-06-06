package fundamentos;

public class TipoString {
    public static void main(String[] args) {
        //charAt imprime o digito q o numero indicar
        System.out.println("Olá pessoal".charAt(2));
        String s = "Boa Tarde";
        //s.concat concatena uma string
        System.out.println(s.concat("!!"));
        //mesma coisa
        System.out.println(s + "!!");
        //testa se a frase começa com a palavra digitada
        System.out.println(s.startsWith("boa"));
        //s.toLowerCase transforma td a string em minusculo e testa dnv
        System.out.println(s.toLowerCase().startsWith("boa"));
        //equalignorecase ignora se ta em caixa alta ou nao
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Silva";
        var idade = 33;
        var salario = 8398.97;

        //\n quebra a linha
        System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome +
                "\nidade: " + idade + "\nSalario: " + salario + "\n \n");

        /*o %s serve pra adicionar a string e %d numeros inteiros
        e %f numeros reais, e o numero do lado do f pra indicar quantas casas quer q tenha*/
        System.out.printf("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("O senhor %s %s tem %d anos e ganha R$%.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
