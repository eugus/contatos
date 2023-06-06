package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    public static void main(String[] args) {
        SortedSet<String> ListaDeAprovados = new TreeSet<>();
        ListaDeAprovados.add("Felps");
        ListaDeAprovados.add("Newt");
        ListaDeAprovados.add("Icaro");
        ListaDeAprovados.add("frodo");

        System.out.println(ListaDeAprovados);
        for (String candidatos: ListaDeAprovados){
            System.out.println(candidatos);
        }

        Set<Integer> nums = new HashSet<>();
        nums.add(79);
        nums.add(69);
        nums.add(59);

        System.out.println(nums);
        for (int numeros: nums){
            System.out.println(numeros);
        }
    }
}
