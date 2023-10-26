package Lambda;

import java.util.ArrayList;

public class StudentInfo {
    void testStudents(ArrayList<Student> al, StudentChecks sc) {
        for (Student s : al) {
            if (sc.check(s)) {
                System.out.println(s);
            }
        }
    }

//        System.out.println(s);
//        System.out.println("_______________");
//        System.out.println("_______________");
//        StudentInfo info = new StudentInfo();
//        info.printStudentsOverGrade(s, 8);
//        System.out.println("_______________");
//        System.out.println("_______________");
//        info.printStudentsUnderAge(s, 25);
//        System.out.println("_______________");
//        System.out.println("_______________");
//        info.printStudentsMixCondition(s, 26, 8, 'm');


    //    void printStudentsOverGrade(ArrayList<Student> al, double grade) {
//        for (Student s : al) {
//            if (s.avgGrade > grade) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsUnderAge(ArrayList<Student> al, int age) {
//        for (Student s : al) {
//            if (s.age > age) {
//                System.out.println(s);
//            }
//        }
//    }
//
//    void printStudentsMixCondition(ArrayList<Student> al, int age, double grade, char sex) {
//        for (Student s : al) {
//            if (s.avgGrade > grade && s.avgGrade < grade && s.sex == sex) {
//                System.out.println(s);
//            }
//        }
//    }


}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student("Ivan", 'm', 22, 3, 8.3);
        Student st2 = new Student("Igor", 'm', 25, 2, 7.4);
        Student st3 = new Student("Andrey", 'm', 31, 1, 8.4);
        Student st4 = new Student("Oleg", 'm', 27, 4, 6.5);
        ArrayList<Student> s = new ArrayList<>();
        s.add(st1);
        s.add(st2);
        s.add(st3);
        s.add(st4);

        StudentInfo info = new StudentInfo();
        info.testStudents(s, new CheckOverGrade());
        System.out.println("________");
        System.out.println("________");
        info.testStudents(s, new StudentChecks() {
            @Override
            public boolean check(Student s) {
                return s.age < 30;
            }
        });
        System.out.println("________");
        System.out.println("________");
        info.testStudents(s, (Student p) -> {
            return p.age < 30;
        });
    }
}

interface StudentChecks {
    boolean check(Student s);
}

class CheckOverGrade implements StudentChecks {
    @Override
    public boolean check(Student s) {
        return s.avgGrade > 8;
    }
}