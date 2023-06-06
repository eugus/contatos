package luis.Aleatorio;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Aluno {
    public static void main(String[] args) {
        Scanner entrada  = new Scanner(System.in);
        double nota1;
        double nota2;
        double resultado;
        String nome;
        System.out.println("Qual seu nome? ");
        nome = entrada.nextLine();
        System.out.println("Digite sua nota 1 : ");
        nota1 = entrada.nextDouble();
        System.out.println("Digite sua nota 2 : ");
        nota2 = entrada.nextDouble();

        resultado = (nota1 + nota2)/2;
        System.out.println(resultado);



        if(resultado >= 6.0){
            System.out.println("Aprovado " + nome );
        } else if (resultado <5.0 && resultado > 3.5 ) {
            System.out.println("Recuperação " + nome);
        }else{
            System.out.println("Reprovado " + nome);
        }

        if (resultado >= 10 && resultado <= 9){
            System.out.println("A");
        }else if (resultado <= 8.9 && resultado >= 8){
            System.out.println("B");
        }else if (resultado <= 7.9 && resultado >= 7){
            System.out.println("C");
        }else if(resultado <= 6.9 && resultado >= 6){
            System.out.println("D");
        }else if (resultado <= 5.9 && resultado >= 5){
            System.out.println("E");
        }else if (resultado < 5) {
            System.out.println("F");
        }


    }
}
