package colecoes;

import java.util.ArrayList;

public class Lista {
    public static void main(String[] args) {
        ArrayList<Usuario> lista = new ArrayList<>();
        Usuario u1 = new Usuario("Felps");

        lista.add(u1);
        lista.add(new Usuario("Desgraça"));
        lista.add(new Usuario("Desgraza"));
        lista.add(new Usuario("Desgrassa"));
        lista.add(new Usuario("Desgraçado"));

        System.out.println(lista.get(3)); // acessar pelo indice

        System.out.println(">>>> " + lista.remove(1));
        System.out.println(lista.remove(new Usuario("Desgrassa")));

        System.out.println("Tem? " + lista.contains(new Usuario("Desgrassa")));

        lista.remove(2);

        for (Usuario u: lista){
            System.out.println(u.nome);
        }
    }
}
