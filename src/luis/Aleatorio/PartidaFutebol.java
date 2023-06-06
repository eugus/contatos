package luis.Aleatorio;

import java.util.Scanner;

public class PartidaFutebol {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int barcelona;
        int madrid;
        int resultado;

        System.out.println("Gols do Barcelona? ");
        barcelona = entrada.nextInt();
        System.out.println("Gols do madrid? ");
        madrid = entrada.nextInt();

        if (barcelona >= madrid) {
            resultado = (barcelona - madrid);
            System.out.println(resultado);
        }else {
            resultado = (madrid - barcelona);
        }

        int status = resultado ;

        switch (status){
            case 0  :
                System.out.println("Empate");
                break;
            case 1, 2, 3:
                System.out.println("Partida normal");
                break;
            case 4, 5, 6, 7, 8, 9 :
                System.out.println("Goleada");
                break;
        }
        System.out.println("Diferença: " + resultado);
        System.out.println("Status: " + status);
    }
}
