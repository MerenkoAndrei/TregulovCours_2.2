package Collection;

import java.util.ArrayList;

public class ArrayListTask {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<String>();
        all.add("Privet");
        all.add("Poka");
        all.add("Java");
        all.add("Andrei");
        System.out.println(all.get(2));
        all.set(1,"JAVAshechka");
        System.out.println(all.get(1));
        all.remove(0);
        System.out.println(all);

        ArrayList<Integer> all1 = new ArrayList<>(10);
        all1.add(1);
        all1.add(2);
        all1.add(3);
        all1.add(4);
        all1.add(5);
        all1.add(6);
        all1.add(7);
        all1.add(8);
        all1.add(9);
        all1.add(10);
        System.out.println(all1);
    }
}
