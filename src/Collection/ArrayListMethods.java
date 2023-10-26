package Collection;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        ArrayList<String> all = new ArrayList<>();
        all.add("Privet");
        all.add("Poka");
        all.add("Java");
        all.add("Andrei");
        System.out.println(all);

        ArrayList<String> all1 = new ArrayList<>();
        all1.add("!!!!");
        all1.add("????");
        all.addAll(0,all1);
        System.out.println(all);

        all.clear();
        System.out.println(all);

        all.add("Privet");
        all.add("Poka");
        all.add("Java");
        all.add("Andrei");
        System.out.println(all);
        System.out.println(all.indexOf("Poka"));
        System.out.println(all.size());
        all.clear();
        System.out.println(all.isEmpty());
        System.out.println(all.contains("Vasya"));


    }
}
