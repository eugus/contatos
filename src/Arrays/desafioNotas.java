package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class desafioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("Quantas notas: ");
        int qtdDeNotas = entrada.nextInt();
        double [] notas = new double[qtdDeNotas];

        for (int i = 0; i < notas.length; i++){
            System.out.print("informe a " + (i + 1) + " nota: ");
            notas[i] = entrada.nextDouble();
        }

        double total = 0;
        for(double nota: notas){
            total += nota;
        }

        double media = total / notas.length;
        System.out.println("a media é: " + media);
        System.out.println(Arrays.toString(notas));

        entrada.close();
    }
}
