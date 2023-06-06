package Poo.DesafioJogador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Jogador {
    public static void main(String[] args) {
        ArrayList<posicao>funcao = new ArrayList<>();
        boolean caralho = true;
        Scanner entrada = new Scanner(System.in);
        ArrayList<Pessoa> jogadores = new ArrayList<>();
        while (caralho){
            System.out.println("""
                    escolha a opção: 
                    [0]Cadastrar 
                    [1]Listar
                    [2]Sair""");
            String opcao = entrada.nextLine();
            Pessoa j1 = new Pessoa();
            switch (opcao){
                case "0":{
                    System.out.println("Nome do jogador: ");
                    j1.nome = entrada.next();
                    System.out.println("Posição(defensor/meia/atacante): ");
                    j1.posicao = entrada.next();
                    while(
                            !j1.posicao.equalsIgnoreCase("defensor")&&
                                    !j1.posicao.equalsIgnoreCase("meia")&&
                                    !j1.posicao.equalsIgnoreCase("atacante")){
                        System.out.println("posicao invalida");
                        System.out.println("Posição(defensor/meia/atacante): ");
                        j1.posicao = entrada.next();
                    }
                    System.out.println("Data de nascimento: ");
                    System.out.print(" Dia: ");
                    j1.dia = entrada.nextInt();
                    System.out.print(" Mes: ");
                    j1.mes = entrada.nextInt();
                    System.out.print(" Ano: ");
                    j1.ano = entrada.nextInt();
                    System.out.println("nacionalidade: ");
                    j1.nassaum = entrada.next();
                    System.out.println("Altura: ");
                    j1.altura = entrada.nextDouble();
                    System.out.println("peso: ");
                    j1.peso = entrada.nextDouble();

                    j1.setNome(j1.nome);
                    j1.setPosicao(j1.posicao);
                    j1.setDia(j1.dia);
                    j1.setMes(j1.mes);
                    j1.setAno(j1.ano);
                    j1.setNassaum(j1.nassaum);
                    j1.setAltura(j1.altura);
                    j1.setPeso(j1.peso);

                    jogadores.add(j1);

                    int idade = j1.calcularIdade();
                    System.out.println(idade);
                    System.out.println();
                    j1.aposentadoria();
                    break;
                } case "1":{
                    for (int i = 0; i < jogadores.size();i++){
                        System.out.println(jogadores.get(i).nome);
                        System.out.println(jogadores.get(i).posicao);
                        System.out.println("----------------------------------");
                    }
                    break;
                } case "2":{
                    caralho = false;
                } default:{
                    System.out.println("digite um dos numeros de vdd porr*");
                }

            }
        }
        entrada.close();
    }
}
