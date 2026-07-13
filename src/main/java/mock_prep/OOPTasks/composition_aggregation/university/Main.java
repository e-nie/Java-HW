package mock_prep.OOPTasks.composition_aggregation.university;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {

        Student student1 = new Student("Tom A.", LocalDate.of(2000, 11, 2));
        Student student2 = new Student("Jane O.", LocalDate.of(2001, 1, 6));
        Student student3 = new Student("Laura E.", LocalDate.of(2002, 3, 17));
        Student student4 = new Student("Elvin Y.", LocalDate.of(1999, 12, 8));

        University university = new University("Uni of Vienna");
        university.enrollStudent(student1, "EN-001");
        university.enrollStudent(student2, "IT-002");
        university.enrollStudent(student3, "BE-003");
        university.enrollStudent(student4, "DE-004");

        university.showAllStudents();
        System.out.println();

        university.findStudent("EN-001").updateAverageGrade(7.0);
        university.findStudent("IT-002").updateAverageGrade(5.0);
        university.findStudent("BE-003").updateAverageGrade(9.0);
        university.findStudent("DE-004").updateAverageGrade(6.5);

        university.showAllStudents();
        System.out.println();


        university.expelStudent("IT-002");
        university.showAllStudents();
        System.out.println();

        System.out.println(university.calculateTotalAverageGrade());
    }
}
