package fundamentos;

public class ConversaoDePrimitivos {
    public static void main(String[] args) {
        double a = 1; //implicita
        System.out.println(a);

        float b = (float) 1.1; //explicita (cast)
        System.out.println(b);

        int c = 127;//explicita (cast)
        byte d = (byte) c;
        System.out.println(d);

        double e = 1.99999;
        int f = (int) e;
        System.out.println(f);


    }
}
