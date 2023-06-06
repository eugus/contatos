package EstrutrasDeControle;

import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {

        //um numero quando ele é divisivel so por 1 e por ele mesmo

        Scanner entrada = new Scanner(System.in);
        System.out.println("digite um numero: ");
        int n = entrada.nextInt();
        int divisores = 0;
        for (int i = 1; i <= n; i++){
            if(n % i == 0){
                divisores++;
            }
        }

        if (divisores > 2){
            System.out.println("nao é primo");
        }else {
            System.out.println("é primo");
        }


        entrada.close();
    }
}
