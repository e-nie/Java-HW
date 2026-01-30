package practice_3;


import homework.staticfinalmodificators.Test1;

public class Main {
    public static void main(String[] args) {

        System.out.println(Student.studentCount);

        Student petya = new Student(18, "Petya");
        int k = petya.age;
        System.out.println(Student.studentCount);


        Student kolya = new Student(20, "Kolya");
        System.out.println(Student.studentCount);

        Test1 test1 = new Test1();
        test1.i = 456;
        System.out.println(test1.i);
        Student.printMaxYears();

    }
}
