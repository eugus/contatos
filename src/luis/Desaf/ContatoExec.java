package luis.Desaf;

import javax.swing.*;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ContatoExec {

    public static void main(String[] args) {
        String add;
        int tele;

        int cnttesc = 0;

        Contato contpe = new ContatoPessoal();

        //contatopessoal
        HashMap<String, Integer> cont = new LinkedHashMap<>();
        cont.put("Pedro", 3133);
        cont.put("Luis", 313313);


        String escolha = JOptionPane.showInputDialog("----- CONTATOS ----- \n[1]Adicionar \n[2] Editar \n[3]Remover" +
                " \n[4]Pesquisar \n[5]Ligar \n[6]Hitórico \n[7]Favoritar");
        System.out.println(escolha);

        switch (escolha) {
            case "1":
                add = JOptionPane.showInputDialog("Digite o nome");

                tele = Integer.parseInt(JOptionPane.showInputDialog("Digite o número"));
                cont.put(add, tele);
                //System.out.println(add)
                JOptionPane.showMessageDialog(null, "Adcionado " + add);
                break;
            case "2":
                JOptionPane.showMessageDialog(null,cont.entrySet());
                cnttesc = Integer.parseInt(JOptionPane.showInputDialog("Digite o nome do contato"));

                String po = JOptionPane.showInputDialog("nome?");
                int euu = Integer.parseInt(JOptionPane.showInputDialog("numero?"));

                cont.put(po,euu);

                JOptionPane.showMessageDialog(null, "editado" + po);


                 /*for (Map.Entry<String,Integer> entry : cont.entrySet()){
                    System.out.println(entry.getKey() + " " + entry.getValue());
                }

                 */

        }
        cont.replace("joao", 3133 );

        for (Map.Entry<String,Integer> entry : cont.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }




       // System.out.println(cont);

    }

