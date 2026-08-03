package mock_prep.OOP_tasks_1.composition_aggregation.university;

import java.time.LocalDate;

public class Main {
    static void main(String[] args) {
        Student s1 = new Student("Adam", LocalDate.of(2000, 8, 5));
        Student s2 = new Student("Mathew", LocalDate.of(2000, 6, 12));
        Student s3 = new Student("Alice", LocalDate.of(2000, 6, 5));
        Student s4 = new Student("Elline", LocalDate.of(2000, 9, 15));

        University uni = new University("Wien University");
        uni.enrollStudent(s1, "1");
        uni.findStudent("1").updateAvgGrade(7.5);
        uni.enrollStudent(s2, "2");
        uni.findStudent("2").updateAvgGrade(4.8);
        uni.enrollStudent(s3, "3");
        uni.findStudent("3").updateAvgGrade(7.7);
        uni.enrollStudent(s4, "4");
        uni.findStudent("4").updateAvgGrade(6.9);

        uni.showStudents();
        System.out.println();

        System.out.println("Average grade " + uni.calculateAverageGrade());

        StudentRecord record = uni.findStudent("5");

        uni.expellStudent("1");
        uni.showStudents();

    }
}
