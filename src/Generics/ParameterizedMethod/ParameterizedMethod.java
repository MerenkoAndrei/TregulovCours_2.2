package Generics.ParameterizedMethod;

import java.util.ArrayList;

public class ParameterizedMethod {
    public static void main(String[] args) {
        ArrayList<Integer> all = new ArrayList<>();
        all.add(10);
        all.add(20);
        all.add(30);
        all.add(40);
        int a = GenMethod.getSecondElement(all);
        System.out.println(a);
    }

}
class GenMethod{
    public static <T>T getSecondElement(ArrayList<T>al){
        return al.get(1);
    }
}