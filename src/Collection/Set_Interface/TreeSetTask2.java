package Collection.Set_Interface;

import java.util.Objects;
import java.util.TreeSet;

public class TreeSetTask2 {
    public static void main(String[] args) {
        TreeSet<Student> treeSet = new TreeSet<>();
        Student st1 = new Student("Zaur",2);
        Student st2 = new Student("Andrey",3);
        Student st3 = new Student("Marina",1);
        Student st4 = new Student("Igor",4);
        Student st5 = new Student("Ivan",1);
        Student st6 = new Student("Gena",4);
        treeSet.add(st1);
        treeSet.add(st2);
        treeSet.add(st3);
        treeSet.add(st4);
        treeSet.add(st5);
        treeSet.add(st6);
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.headSet(st1));
        System.out.println(treeSet.tailSet(st2));
        System.out.println(treeSet.subSet(st1,st4));
        System.out.println(st5.equals(st3));
    }
}

class Student implements Comparable<Student>{
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }

    int cours;

    public Student(String name, int cours) {
        this.name = name;
        this.cours = cours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return cours == student.cours;
    }

    @Override
    public int hashCode() {
        return Objects.hash(cours);
    }

    @Override
    public int compareTo(Student other) {
        return this.cours - other.cours;
    }
}