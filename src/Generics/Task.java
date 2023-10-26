package Generics;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("ok");
        list.add("Privet");
        list.add("Poka");
        list.add("N u chto takor to");
        for (Object o:list){
            System.out.println(o + " - dlina - " + ((String)o).length());
        }
    }
}
