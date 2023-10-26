package Collection.MapInterFace;

import java.util.LinkedHashMap;

public class LinkedHashMapTask {
    public static void main(String[] args) {
        LinkedHashMap<Double, Student> lhm =
                new LinkedHashMap<>(16,0.75f, true);
        Student st1 = new Student("Zaur", "Tregulov",3);
        Student st3 = new Student("Zina", "Olt",4);
        Student st5 = new Student("Andrey", "Merenko",1);
        Student st6 = new Student("Nina", "Utkina",2);
        lhm.put(5.8,st1);
        lhm.put(8.2,st6);
        lhm.put(5.2,st3);
        lhm.put(7.5,st5);
        System.out.println(lhm);
        System.out.println(lhm.get(5.8));
        System.out.println(lhm.get(7.5));
        System.out.println(lhm);

    }
}
