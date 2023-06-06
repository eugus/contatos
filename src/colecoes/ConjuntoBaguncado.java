package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
    public static void main(String[] args) {
        HashSet conjunto = new HashSet();
        conjunto.add("pan pan pan");//add adiciona
        conjunto.add(73);//int -> Integer
        conjunto.add(6.9);
        conjunto.add(false);
        conjunto.add('A');

        System.out.println(conjunto.size());
        conjunto.remove('A');//oq tiver em ()
        conjunto.remove(73);
        System.out.println(conjunto.size());

        System.out.println(conjunto.contains(73));
        System.out.println(conjunto.contains(6.9));

        Set nums = new HashSet();
        nums.add(6.9);
        nums.add(true);
        nums.add("wants a ride");

        System.out.println(conjunto);
        System.out.println(nums);

        //conjunto.addAll(nums);//uniao entre os dois conjuntos
        conjunto.retainAll(nums);
        System.out.println(conjunto);

        conjunto.clear();
        System.out.println(conjunto);
    }
}
