package colecoes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Divisores {
    public static void main(String[] args) {
        Queue<Integer> fila = new LinkedList<>();
        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int n1 = entrada.nextInt();
        for (int i = 1; i <= n1; i++){
            if (n1 % i == 0){
                fila.add(i);
            }

        }

        for(int divisores: fila){
            System.out.println(n1 + " é divisivel por: " + divisores);
        }




        entrada.close();
    }
}
