package luis.Aleatorio;

import java.util.Scanner;

public class Whiles3 {
    public static void main(String[] args) {
        Scanner entrada =  new Scanner(System.in);

        String nome;
        System.out.println("Digite seu nome ou s para sair");
        nome = entrada.nextLine();

        while (!nome.equals("s")){
            System.out.println("Bem vindo " + nome);
            System.out.println("Digite seu nome ou s para sair");
            nome = entrada.nextLine();
        }
        System.out.println("Fim da execução");
    }
}
