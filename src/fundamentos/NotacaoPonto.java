package fundamentos;

public class NotacaoPonto {
    public static void main(String[] args) {

        String s = "bom dia, x";
        s = s.replace("x", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");

        System.out.println(s);
        //tipos primitivos nao tem o operador "."
        int a = 3;
        System.out.println(a);
    }
}
