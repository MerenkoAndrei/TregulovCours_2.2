package Collection;

import java.util.LinkedList;

public class LinkedListTask {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan",2);
        Student st2 = new Student("Igor",3);
        Student st3 = new Student("Alex",1);
        Student st4 = new Student("Yan",4);
        Student st5 = new Student("Sergey",3);
        LinkedList<Student> studentLinkedList2 = new LinkedList<>();
        studentLinkedList2.add(st1);
        studentLinkedList2.add(st2);
        studentLinkedList2.add(st3);
        studentLinkedList2.add(st4);
        studentLinkedList2.add(st5);
        System.out.println(studentLinkedList2);
        System.out.println(studentLinkedList2.get(2));
        studentLinkedList2.remove(3);
        System.out.println(studentLinkedList2);
    }
}

class Student{
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", course=" + course +
                '}';
    }
}
