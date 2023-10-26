package Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100,"Andrei","Merenko",95000);
        Employee emp2 = new Employee(92,"Ivan","Kulko",15000);
        Employee emp3 = new Employee(75,"Egor","Potapov",75000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n " + list);
        Collections.sort(list);
        System.out.println("After sorting\n" + list);
    }
}
class Employee implements Comparable<Employee>{
    Integer id;
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

    @Override
    public int compareTo(Employee anotherEmp) {
        //return this.id.compareTo(anotherEmp.id);
       int res=this.name.compareTo(anotherEmp.name);
       if (res==0){
           res = this.surname.compareTo(anotherEmp.surname);
       }
        return res;
    }
}