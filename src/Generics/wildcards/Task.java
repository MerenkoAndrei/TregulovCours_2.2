package Generics.wildcards;

import java.util.ArrayList;
import java.util.List;

public class Task {
    public static void main(String[] args) {
       // List<Number> ls = new ArrayList<Integer>();

        List <Double> list1 = new ArrayList<>();
        list1.add(3.14);
        list1.add(5.14);
        list1.add(6.14);
        showListInfo(list1);
    }
    static void showListInfo(List<?>list){
        System.out.println("Мой лист содержит следующие элементы: " + list);

    }

}
