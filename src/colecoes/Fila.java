package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> fila = new LinkedList<>();

        //add e offer adicionam elementos na fila

        //Diferença é o comportamento que ocorre quando a fila está cheia

        fila.add("Felps");//lança uma excessão
        fila.offer("Jogador de ff");//retorna false
        fila.add("Esquizo");
        fila.offer("Gay");
        fila.add("Newt");

        // diferença é o comportamento q ocorre quando a fila esta vazia
        System.out.println(fila.peek());// retorna null
        System.out.println(fila.peek());
        System.out.println(fila.element());// lança uma excessão
        System.out.println(fila.element());

        //Poll e remove --> obter o proximo elemento da fila e remove
        //diferença é o comportamento q ocorre quando a fila esta vazia

        System.out.println(fila.poll());//retorna null
        System.out.println(fila.poll());//retorna null
        System.out.println(fila.poll());//retorna null
        System.out.println(fila.remove());//lança uma excessão

        //fila.size();
        //fila.clear();
        //fila.isEmpty();
        //fila.contains(...);
    }
}
