package Collection.queue_interface;

import java.util.Objects;
import java.util.PriorityQueue;

public class PriorityQueueTask {
    public static void main(String[] args) {
        Student st1 = new Student("Zaur",2);
        Student st2 = new Student("Andrey",3);
        Student st3 = new Student("Marina",1);
        Student st4 = new Student("Igor",4);
        Student st5 = new Student("Ivan",1);
        Student st6 = new Student("Gena",4);
        PriorityQueue<Student> p = new PriorityQueue<>();
        p.add(st1);
        p.add(st2);
        p.add(st3);
        p.add(st4);
        p.add(st5);
        p.add(st6);
//        p.offer("Andrey");
//        p.offer("Zaur");
//        p.add("Ivan");
//        p.add("Olken");
//        p.add("Katya");
        System.out.println(p);
//        System.out.println(p.peek());
    }
}


class Student implements Comparable<Student> {
    String name;
    int cours;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", cours=" + cours +
                '}';
    }



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

