package luis.Aleatorio;

import javax.swing.*;

public class Gabriel {
    public static void main(String[] args) {
        Object[] options = {"OK", "CANCELAR", "VOLTAR"};

      /*  JOptionPane.showOptionDialog(null, "Clique OK para continuar",  "Aviso", JOptionPane.DEFAULT_OPTION,
                JOptionPane.WARNING_MESSAGE,
                null, options, options[0]);}*/

        int resposta = JOptionPane.showConfirmDialog(null, "Voce é casado? ");
        System.out.println(resposta);


    }
}
