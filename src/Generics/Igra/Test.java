package Generics.Igra;

public class Test {
    public static void main(String[] args) {
        Schoolar s1 = new Schoolar("Ivan", 13);
        Schoolar s2 = new Schoolar("Egor", 14);

        Schoolar s3 = new Schoolar("Lexa", 12);
        Schoolar s4 = new Schoolar("Petya", 15);

        Student st1 = new Student("Alex", 25);
        Student st2 = new Student("Andrik", 19);

        Employee emp1 = new Employee("Nikolay",45);
        Employee emp2 = new Employee("Sergey",36);

        Team <Schoolar >schoolarTeam = new Team<>("Ciplata");
        Team <Schoolar >schoolarTeam2 = new Team<>("Chempioni");
        Team <Student >studentTeam = new Team<>("Zelenie");
        Team <Employee >employeeTeam = new Team<>("Pensiya");
        schoolarTeam.addNewParticipant(s1);
        schoolarTeam.addNewParticipant(s2);
        schoolarTeam2.addNewParticipant(s3);
        schoolarTeam2.addNewParticipant(s4);

        studentTeam.addNewParticipant(st1);
        studentTeam.addNewParticipant(st2);

        employeeTeam.addNewParticipant(emp1);
        employeeTeam.addNewParticipant(emp2);

        schoolarTeam.playWith(schoolarTeam2);
    }
}
