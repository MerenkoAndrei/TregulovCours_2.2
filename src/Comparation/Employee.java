package Comparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Andrei", "Merenko", 95000);
        Employee emp2 = new Employee(92, "Ivan", "Kulko", 15000);
        Employee emp3 = new Employee(75, "Egor", "Potapov", 75000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        Collections.sort(list,new IdComparator());
        System.out.println("Before sorting \n " + list);
        System.out.println("After sorting\n" + list);
    }

    int id;
    String name;
    String surname;
    int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                '}';
    }
}
class IdComparator implements Comparator<Employee>{

    @Override
    public int compare(Employee emp1, Employee emp2) {
        if (emp1.id == emp2.id) {
            return 0;
        } else if (emp1.id < emp2.id) {
            return -1;
        } else {
            return 1;
        }
    }
}