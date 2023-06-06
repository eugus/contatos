package Poo;

public class Aula02 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.cor ="Amarelo";
        //c1.ponta = 0.5;
        //c1.tampada = true;
        c1.status();
        c1.rabiscar();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.cor = "Azul";
        //c2.tampada = false;
        c2.status();
        c2.rabiscar();
    }
}
