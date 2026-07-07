package mock_prep.student_system;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GradeJournal {

    private Map<String, Student> students;

    public GradeJournal() {
        this.students = new HashMap<>();
    }

    public void addGrade(String name, int grade) {
//        if (!students.containsKey(name)) {
//            students.put(name, new Student(name));
//        }
        students.putIfAbsent(name, new Student(name));//created new student
        Student student = students.get(name);
        student.getGrades().add(grade);

    }

    public List<Integer> getGrades(String name) {
        if (!students.containsKey(name)) throw new IllegalArgumentException();
        Student student = students.get(name);
        return student.getGrades();
    }

    public double getAverageGrade(String name) {
        Student student = students.get(name);
        List<Integer> grades = getGrades(name);
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.size();
    }

    public boolean hasStudent(String name) {
        return students.containsKey(name);
    }

    public int getStudentsCount() {
        return students.size();
    }
}
