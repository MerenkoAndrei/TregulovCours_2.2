package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        List<String> List = new ArrayList<>();
        List.add("Andrei");
        List.add("Ivan");
        List.add("Maria");
        List.add("Egor");
        System.out.println("Pered sortirovkoy");
        System.out.println(List);
        Collections.sort(List);
        System.out.println("Posle sortirovkoi");
        System.out.println(List);
    }
}
