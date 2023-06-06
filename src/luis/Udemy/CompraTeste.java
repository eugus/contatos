package luis.Udemy;

import java.util.Scanner;

public class CompraTeste {
    Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {

        Compra c1 = new Compra();
        c1.cliente = "Joao Pedro";
        c1.adicionarItem(new Item("Caneta", 20, 7.45));
        c1.itens.add(new Item("Borracha" , 12, 3.89));
        c1.itens.add(new Item("Caderno", 3, 18.2));

        System.out.println(c1.cliente);
        System.out.println(c1.itens.size());

    }
}
