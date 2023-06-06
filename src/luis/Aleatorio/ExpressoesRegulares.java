package luis.Aleatorio;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ExpressoesRegulares {
    public static void main(String[] args) {
        String regex = "ab";
        String texto = "abaaaba";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(regex);
        System.out.println("texto: "+texto);
        System.out.println("indice: 0123456789");
        System.out.println("expressao " + matcher.pattern());
        System.out.println("posições encontradas");
        while (matcher.find()) {
            System.out.print(matcher.start() + " ");
         //   System.out.println(matcher.find() + " ");
        }

    }
}
