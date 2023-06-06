package fundamentos;

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        //por n ter o ln nao cria uma nova linha
        System.out.print("bom");
        System.out.print("dia");

        System.out.println("bom");
        System.out.println("dia");

        System.out.printf("Megasena: %d %d %d %d %d %d %d %n", 1,2,3,4,5,6,7);
        System.out.printf("Nome: %s%n","João");

        Scanner entrada = new Scanner(System.in);

        System.out.print("digite o seu nome: ");
        String nome= entrada.nextLine();
        System.out.print("digite o seu sobrenome: ");
        String sobrenome = entrada.nextLine();
        System.out.print("digite a sua idade: ");
        int idade = entrada.nextInt();

        System.out.printf("%s %s tem %d anos. %n" ,
                nome, sobrenome,idade);
        entrada.close();


    }
}
