package luis.Aleatorio;
import Arrays.Usuarios;
import javax.swing.*;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Cadastro {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        JFrame frame = new JFrame();
        JPasswordField passowordField = new JPasswordField();
        ArrayList<Usuarios> pessoas = new ArrayList<>();


        boolean executando = true;

        while (executando){
            Object[] options = {"SIM", "NÃO", "VOLTAR"};
            JOptionPane.showOptionDialog(null, "Deseja se conectar? ", "Aviso", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE,
                    null, options, options[0]);


            while (executando) {

                // int s = JOptionPane.showConfirmDialog(null, "Deseja se conectar? ");
                int escolha = Integer.parseInt(JOptionPane.showInputDialog(null, "Escolha a opção desejada " + "\n [1] Cadastro " + "\n [2] Login"));
                if (escolha == 1) {

                    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
                    //System.out.println(nome);
                    int opção = JOptionPane.showConfirmDialog(frame, passowordField, "Digite sua senha: ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    Usuarios cadastro = new Usuarios(nome, "");

                    pessoas.add(cadastro);

                    JOptionPane.showMessageDialog(null, "Cadastro Realizado! " + "\n Seja bem-vindo, " +  nome.toUpperCase(Locale.ROOT) + ".");

                    break;
                } else if (escolha == 2) {
                    String nome = JOptionPane.showInputDialog("Digite seu nome: ");
                    int opção = JOptionPane.showConfirmDialog(frame, passowordField, "Digite sua senha: ", JOptionPane.OK_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE);
                    Usuarios login = new Usuarios(nome, "");
                    pessoas.add(login);
                    //System.out.println(pessoas);

                    JOptionPane.showMessageDialog(null, "Sucesso em Login! " + "\n Seja bem-vindo novamente, " + nome.toUpperCase() + ".");
                break;
                } else {
                    JOptionPane.showMessageDialog(null, "ERRO!");
                }

            }// while
           // System.out.println("usuario" + pessoas);
          //  System.out.println(passowordField);
        }
    } //main
}












