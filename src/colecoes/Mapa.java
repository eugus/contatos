package colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {

        Map<Integer, String> usuarios = new HashMap<>();

        usuarios.put(1, "Felps");
        usuarios.put(2, "newt");
        usuarios.put(3, "fa da loud");
        usuarios.put(4, "alzheimer");
        usuarios.put(5, "esquizo");

        System.out.println(usuarios.size());
        System.out.println(usuarios.isEmpty());

        System.out.println(usuarios.keySet());
        System.out.println(usuarios.values());
        System.out.println(usuarios.entrySet());

        System.out.println(usuarios.containsKey(4));
        System.out.println(usuarios.containsValue("esquizo"));

        System.out.println(usuarios.get(2));
        System.out.println(usuarios.remove(5));
        System.out.println(usuarios.remove(2, "Gus"));

        for (int chave: usuarios.keySet()){
            System.out.print(chave + " ");
        }
        for (String valor: usuarios.values()){
            System.out.println(valor);
        }
        for (Map.Entry<Integer,String>registro: usuarios.entrySet()){
            System.out.print(registro.getKey() + " --> ");
            System.out.println(registro.getValue());
        }
    }
}
