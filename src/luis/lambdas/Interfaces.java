package luis.lambdas;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Interfaces {
    public static void main(String[] args) {

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        /*System.out.println("Forma Tradicional");
        for (String nome : aprovados) {
            System.out.println(nome);
        }

         */

        /*System.out.println("\nLambda");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));

         */

        System.out.println("\n Method ");
        aprovados.forEach(System.out::println);





    }

}
