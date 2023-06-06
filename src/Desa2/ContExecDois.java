package Desa2;

import javax.swing.*;
import java.util.*;

public class ContExecDois {
    public static void main(String[] args) throws EmptyFieldsException {
        Scanner entrada = new Scanner(System.in);
        ContatoDois cc = new ContPessoDois("dhfjsdf", 8768);
        //var
        String add;

        int tele;
        int cnttesc = 0;

        boolean pessoal = false;
        boolean proff = false;

        //contatopessoal
        HashMap<String, ContatoDois> cont = new LinkedHashMap<>();
        cont.put("Luis", new ContPessoDois("87888", 45454));
        cont.put("Cabral", new ContPessoDois("834783", 87878));

        String ess = JOptionPane.showInputDialog("Escolha?");

        if (ess.equals("1")) {
            pessoal = true;
            proff = false;
        } else if (ess.equals("2")) {
            pessoal = false;
            proff = true;

        } else {
            System.err.println("Opcção não encontrada");
        }

        while (pessoal) {
            String escolha = JOptionPane.showInputDialog(null, "----- CONTATOS ----- \n[1]Adicionar \n[2]Editar \n[3]Remover" +
                    " \n[4]Pesquisar \n[5]Ligar \n[6]Hitórico \n[7]Favoritar");

            if (Integer.parseInt(escolha) == JOptionPane.CANCEL_OPTION) {
                String escolha1 = JOptionPane.showInputDialog(null, "----- CONTATOS ----- \n[1]Adicionar \n[2] Editar \n[3]Remover" +
                        " \n[4]Pesquisar \n[5]Ligar \n[6]Hitórico \n[7]Favoritar");
                pessoal = true;
                break;
            } else if (Integer.parseInt(escolha) == JOptionPane.CLOSED_OPTION) {
                pessoal = true;
                break;

            }

            switch (escolha) {
                case "1": // adicionar
                    System.out.println("Digite o nome");
                    add = entrada.nextLine();
                    System.out.println("digite o numero");
                    tele = entrada.nextInt();
                    cont.put(add, new ContPessoDois(add, tele));
                    System.out.println(add.toUpperCase() + " adicionado.");
                    System.out.println(cont);
                    cont.forEach((key, value) -> System.out.println(key + " -> " + value));
                    break;
                case "8": // editar
                    /*System.out.println(cont.entrySet());
                    System.out.println("Digite o nome");
                    String edt = entrada.nextLine();
                    System.out.println("Digite o novo numero");
                    int edtt = entrada.nextInt();
                    cont.replace(edt, new ContPessoDois(edt, edtt));
                    System.out.println(edt + ", editado com sucesso.");
                    cont.forEach((key, value) -> System.out.println(key + " -> " + value)); // falta o if

                     */
                    System.out.println(34234);
                    break;
                case "3": //remover
                /*System.out.println(cont.entrySet());
                System.out.println("Digite o nome do cntt p/ remover");
                String cnttrem = entrada.nextLine();
                 */
                    boolean ggg = true;
                    while (ggg) {
                        String cnttrem = JOptionPane.showInputDialog("Digite o nme do cntt");
                        int pp = JOptionPane.showConfirmDialog(null, "Deseja remover msm" + cnttrem);
                        if (pp == JOptionPane.YES_OPTION) {
                            cont.remove(cnttrem);
                            JOptionPane.showMessageDialog(null, cnttrem + "removido com sucesso");
                            ggg = false;
                            break;
                        }
                        if (pp == JOptionPane.CANCEL_OPTION) {
                            ggg = false;
                            break;

                        /*JOptionPane.showInputDialog("Digite o nme do cntt");
                        int hh = JOptionPane.showConfirmDialog(null, "Deseja remover msm" + cnttrem);
                         */
                            //
                        } else if (pp == JOptionPane.CLOSED_OPTION) {
                            ggg = false;
                            break;

                        }

                    }

                    //System.out.println("Conato removido com sucesso");
                    cont.forEach((key, value) -> System.out.println(key + " -> " + value));

                    break;
                case "4": // pesquisar
                    System.out.println(cont);
                    System.out.println("Digite o nome p/ pesquisar");
                    String contpes = entrada.nextLine();
                    System.out.println(cont.get(contpes)); // falta exibir o nome
                    // cont.forEach((key, value) -> System.out.println(key + " -> " + value));
                    break;
                case "5": //ligar
                    System.out.println(cont);
                    System.out.println("Escolha p/ qm quer ligar");
                    String contlig = entrada.nextLine();
                    System.out.println(cc.ligar(contlig));
                    break;
                case "6"://historico

                    break;
                case "7"://favoritar
                    System.out.println(cont);
                    System.out.println("Escolha o contato p/ favoritar");
                    String confav = entrada.nextLine();
                    System.out.println(cc.favoritar(confav));
                    break;
            }
        }

            while (proff) {
                System.out.println("----- CONTATOS ----- \n[1]Adicionar \n[2] Editar \n[3]Remover" +
                        " \n[4]Pesquisar \n[5]Ligar \n[6]Hitórico \n[7]Favoritar");

                String escolha2 = entrada.nextLine();

                switch (escolha2) {
                    case "1": // adicionar
                        System.out.println("Digite o name");
                        add = entrada.nextLine();
                        System.out.println("digite o numero");
                        tele = entrada.nextInt();
                        cont.put(add, new ContPessoDois(add, tele));
                        System.out.println(add.toUpperCase() + " adicionado.");
                        System.out.println(cont);
                        cont.forEach((key, value) -> System.out.println(key + " -> " + value));
                        break;
                    case "2": // editar
                        System.out.println(cont.entrySet());
                        System.out.println("Digite o nome");
                        String edt = entrada.nextLine();
                        System.out.println("Digite o novo numero");
                        int edtt = entrada.nextInt();
                        cont.replace(edt, new ContPessoDois(edt, edtt));
                        System.out.println(edt + ", editado com sucesso.");
                        cont.forEach((key, value) -> System.out.println(key + " -> " + value)); // falta o if
                        break;
                    case "3": //remover
                        System.out.println(cont.entrySet());
                        System.out.println("Digite o nome do cntt p/ remover");
                        String cnttrem = entrada.nextLine();
                        cont.remove(cnttrem);
                        System.out.println("Conato removido com sucesso");
                        cont.forEach((key, value) -> System.out.println(key + " -> " + value));
                        break;
                    case "4": // pesquisar
                        System.out.println(cont);
                        System.out.println("Digite o nome p/ pesquisar");
                        String contpes = entrada.nextLine();
                        System.out.println(cont.get(contpes)); // falta exibir o nome
                        // cont.forEach((key, value) -> System.out.println(key + " -> " + value));
                        break;
                    case "5": //ligar
                        System.out.println(cont);
                        System.out.println("Escolha p/ qm quer ligar");
                        String contlig = entrada.nextLine();
                        System.out.println(cc.ligar(contlig));
                        break;
                    case "6"://historico

                        break;
                    case "7"://favoritar
                        System.out.println(cont);
                        System.out.println("Escolha o contato p/ favoritar");
                        String confav = entrada.nextLine();
                        System.out.println(cc.favoritar(confav));
                        break;
                    //int nn = JOptionPane.showConfirmDialog(null,"sdda");

                }
            }

    }
}