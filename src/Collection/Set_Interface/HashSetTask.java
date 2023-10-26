package Collection.Set_Interface;

import java.util.HashSet;
import java.util.Set;

public class HashSetTask {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Zaur");
        set.add("Andrey");
        set.add("Marina");
        set.add("Igor");
        set.remove("Zaur");
//        set.add("Igor"); - дубликаты не выводит
//        System.out.println(set);
        for (String s : set) {
            System.out.println(s);
        }
        System.out.println(set.size());
        System.out.println(set.isEmpty());
        System.out.println(set.contains("Misha"));

    }
}
