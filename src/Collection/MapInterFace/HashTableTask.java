package Collection.MapInterFace;

import java.util.Hashtable;

public class HashTableTask {
    public static void main(String[] args) {
        Hashtable<Double, Student> ht = new Hashtable<>();
        Student st1 = new Student("Zaur", "Tregulov",3);
        Student st3 = new Student("Zina", "Olt",4);
        Student st5 = new Student("Andrey", "Merenko",1);
        Student st6 = new Student("Nina", "Utkina",2);
        ht.put(7.8,st1);
        ht.put(8.8,st6);
        ht.put(4.2,st3);
        ht.put(5.6,st5);
        System.out.println(ht);
    }
}
