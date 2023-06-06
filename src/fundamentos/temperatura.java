package fundamentos;

public class temperatura {
    public static void main(String[] args) {
        //(°F - 32) x 5/9 = °C
        final double FATOR = 5.0/9.0;
        final double AJUSTE = 32;
        double fahrenheit = 86;
        double celsius = (fahrenheit - AJUSTE) * FATOR;

        System.out.println("o resultado é " + celsius + "°C");
    }
}
