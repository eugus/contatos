package Desa2;

import javax.swing.*;

public class TesteJ {
    public static void main(String[] args) {
        int i = JOptionPane.showConfirmDialog(
                null,
                "Deseja continuar?"
        );
        if(i == JOptionPane.YES_OPTION) {
            System.out.println("Clicou em Sim");
        }
        else if(i == JOptionPane.NO_OPTION) {
            System.out.println("Clicou em Não");
        }
        else if(i == JOptionPane.CANCEL_OPTION) {
            System.out.println("Clicou em Cancel");
        }
    }
}
