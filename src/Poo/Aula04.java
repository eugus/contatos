package Poo;

public class Aula04 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.status();

        System.out.println();
        Caneta c2 = new Caneta("Faber", "Roxa", 0.5, 100);
        c2.status();
    }
}
