 package Poo;

public class Aula03 {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "compactor";
        c1.cor = "Preta";
        //c1.ponta = 0.7;
        c1.carga = 80;
        //c1.tampada = false;
        
        
        
         

        c1.tampar();
        c1.status();
        c1.destampar();
        c1.status();
        c1.rabiscar();
    }
}
