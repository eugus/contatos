package fundamentos;

import javax.swing.*;

public class ConversaoStringNumero {
    public static void main(String[] args) {
        String valor1 = JOptionPane.showInputDialog(
                "digite o primeiro numero: ");
        String valor2 = JOptionPane.showInputDialog("digite o numero 2: ");

        System.out.println(valor1 + valor2);

        double numero1 = Double.parseDouble(valor1);
        double numero2 = Double.parseDouble(valor2);

        double soma = numero1 + numero2;
        System.out.println("soma é " + soma);
        System.out.println("media é " + soma/2);
    }
}
