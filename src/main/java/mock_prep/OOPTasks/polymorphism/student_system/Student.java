package mock_prep.OOPTasks.polymorphism.student_system;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private List<Integer> grades;

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<Integer> getGrades() {
        return grades;
    }
}
