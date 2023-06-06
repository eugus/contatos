package Desa2;

import javax.swing.*;

public class TesteParse {
    public static void main(String[] args) {
        boolean kk = true;


        while (kk){
            String es = JOptionPane.showInputDialog("Deseja conntinuar?");
            int escolha = Integer.parseInt(JOptionPane.showInputDialog( "[1]dsadasd \n[2]sadasdasd \n[3]sdasdasd"));
            System.out.println(escolha);

            if (escolha == JOptionPane.CLOSED_OPTION){
                kk = true;
                break;
            }else if (escolha == JOptionPane.CANCEL_OPTION){
                JOptionPane.showMessageDialog(null, "dksaldkjassd");

            }

        }
    }
}
