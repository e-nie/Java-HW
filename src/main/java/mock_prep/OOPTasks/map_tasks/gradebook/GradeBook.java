package mock_prep.OOPTasks.map_tasks.gradebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeBook {
    private Map<String, List<Integer>> grades;

    public GradeBook() {
        grades = new HashMap<>();
    }

    public void addGrade(String student, int grade) {
        if (grades.containsKey(student)) {
            List<Integer> studentGrades = grades.get(student);
            studentGrades.add(grade);
        } else {
            List<Integer> studentGrades = new ArrayList<>();
            studentGrades.add(grade);
            grades.put(student, studentGrades);
        }
    }

    public List<Integer> getGrades(String student) {
        return grades.get(student);
    }

    public double getAverageGrade(String student) {
        List<Integer> studentGrades = grades.get(student);
        if(studentGrades== null){
            return 0;
        }
        double sum = 0;
        for (Integer studentGrade : studentGrades) {
            sum += studentGrade;
        }
        return sum / studentGrades.size();
    }

    public boolean containsStudent(String student) {
        return grades.containsKey(student);
    }

    public int getStudentsCount(){
        return grades.size();
    }
}