package Poo.DesafioJogador;

import java.util.Arrays;
import java.util.List;

public class Pessoa {
    public String nome;
    public String posicao;
    public int dia, mes, ano;
    public String nassaum;
    public double altura;
    public double peso;

    public Pessoa(){

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getNassaum() {
        return nassaum;
    }

    public void setNassaum(String nassaum) {
        this.nassaum = nassaum;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    public int calcularIdade(){
        setAno(2023 - getAno());
        return getAno();
    }
    public void funcao(String posicao){
        this.posicao = posicao;
    }
    public void aposentadoria(){
        if (posicao.equalsIgnoreCase("atacante")){
             int aposent = (35 - getAno());
            System.out.println("faltam " + aposent + " anos pra ele se aposentar");
        }else if (posicao.equalsIgnoreCase("meia")){
            int aposent = (38 - getAno());
            System.out.println("faltam " + aposent + " anos pra ele se aposentar");
        } else if (posicao.equalsIgnoreCase("defensor")) {
            int aposent = (40 - getAno());
            System.out.println("faltam " + aposent + " anos pra ele se aposentar");
        }else {
            System.out.println("posição invalida");
        }
    }
}
