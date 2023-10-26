package Collection.MapInterFace;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class HashCodTask {
    public static void main(String[] args) {
        Map<Student, Double> map = new HashMap<>();
        Student st1 = new Student("Andrey", "Merenko", 1);
        Student st2 = new Student("Alex", "Ivanov", 4);
        Student st3 = new Student("Oleg", "Katkov", 3);
        map.put(st1, 5.4);
        map.put(st2, 7.9);
        map.put(st3, 6.5);
        System.out.println(map);

        Student st4 = new Student("Andrey", "Merenko", 1);
        Student st5 = new Student("Igor", "Gan", 5);
//        boolean result = map.containsKey(st4);
//        System.out.println("result = " + result);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }

}

class Student {
    String name;
    String surname;
    int cours;

    public Student(String name, String surname, int cours) {
        this.name = name;
        this.surname = surname;
        this.cours = cours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return cours == student.cours && Objects.equals(name, student.name) && Objects.equals(surname, student.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, cours);
    }

//    public int hashCode() {
//        return name.length() * 7 + surname.length() * 11 + cours * 53;
//    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", cours=" + cours +
                '}';
    }
}
