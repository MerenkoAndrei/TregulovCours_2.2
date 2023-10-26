package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("a");
        StringBuilder sb2 = new StringBuilder("b");
        StringBuilder sb3 = new StringBuilder("c");
        StringBuilder sb4 = new StringBuilder("d");
        StringBuilder [] array = {sb1, sb2, sb3, sb4};
        List<StringBuilder> list = Arrays.asList(array);
        System.out.println(list);
        array[0].append("!!!!");
        System.out.println(list);

        ArrayList<String> all1 = new ArrayList<>();
        all1.add("Privet");
        all1.add("Poka");
        all1.add("Java");
        all1.add("Andrei");
        all1.add("Ivan");
        System.out.println(all1);
        List<String> myList = all1.subList(1,4);
        System.out.println(myList);
        ArrayList<String> all2 = new ArrayList<>();
        all2.add("Ivan");
        all2.add("Poka");
        all2.add("Java");
        all2.add("Kolya");

        //all1.retainAll(all2);
        //System.out.println(all1);

        //all1.retainAll(all2);
        // System.out.println(all1);

        //System.out.println(all1.containsAll(all2));

        //boolean b = all1.containsAll(all2);
        //System.out.println(b);

    }
}
