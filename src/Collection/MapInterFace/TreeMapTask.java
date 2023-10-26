package Collection.MapInterFace;

import java.util.TreeMap;

public class TreeMapTask {
    public static void main(String[] args) {
        TreeMap<Double, Student> treeMap = new TreeMap<>();
        Student st1 = new Student("Zaur", "Tregulov",3);
        Student st2 = new Student("Alex", "Orlov",1);
        Student st3 = new Student("Zina", "Olt",4);
        Student st4 = new Student("Ivan", "Frolov",3);
        Student st5 = new Student("Andrey", "Merenko",1);
        Student st6 = new Student("Nina", "Utkina",2);
        Student st7= new Student("Oleg", "Popov",3);
        treeMap.put(5.8,st1);
        treeMap.put(8.2,st6);
        treeMap.put(5.2,st3);
        treeMap.put(7.5,st5);
        treeMap.put(6.3,st4);
        treeMap.put(9.6,st7);
        treeMap.put(4.8,st2);

        System.out.println(treeMap);
        System.out.println("________________");
        System.out.println(treeMap.get(5.8));
        treeMap.remove(5.2);
        System.out.println(treeMap);
        System.out.println("________________");
        System.out.println(treeMap.descendingMap());
        System.out.println("________________");
        System.out.println(treeMap.tailMap(7.8));
        System.out.println("________________");
        System.out.println(treeMap.headMap(7.5));
        System.out.println("________________");
        System.out.println(treeMap.lastEntry());
        System.out.println("________________");
        System.out.println(treeMap.firstEntry());
    }
}
