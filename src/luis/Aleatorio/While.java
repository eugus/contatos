package luis.Aleatorio;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
     int contador = 0;
     int valor;
     int salto;

     int cont = 1;
     int num;
     int soma = 0;
     int escolha;
     int maior = 0;


      /*while (contador >= 0){
          System.out.println(contador);
          contador = contador - 2;
      }

       */

       /* System.out.println("Ate quanto? ");
        valor = entrada.nextInt();
        System.out.println("salto? ");
        salto = entrada.nextInt();

        while (contador <= valor){
            System.out.println(contador);
            contador = contador + salto;
        }

        */
        System.out.println("quantas? ");
        escolha = entrada.nextInt();


        while (cont <= escolha){
            System.out.println("num? ");
            num = entrada.nextInt();

            if (num > maior){
                maior = num;
            }
            soma = soma + num;
            cont = cont + 1;
        }
        System.out.println(soma);
        System.out.println(maior);











    }
}
