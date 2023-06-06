package luis.Aleatorio;

import java.util.Scanner;

public class CanetTwo {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);




        CanetaCons c1 = new CanetaCons("", "a", 0.5f, true);
        /*
        System.out.println("modelo?");
        c1.setModelo(entrada.nextLine());
        System.out.println("cor?");
        c1.setCor(entrada.nextLine());

         */

        System.out.println("tenho uma caneta "+ c1.getModelo() + " da cor " + c1.getCor() + " com a ponta " + c1.getPonta() + " e está " + c1.tampar()
        );

        //c1.status();
    }
}
