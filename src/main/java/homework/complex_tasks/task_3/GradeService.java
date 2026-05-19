package homework.complex_tasks.task_3;

import java.util.ArrayList;
import java.util.List;

public class GradeService<T extends Number> {
    private List<StudentGrade<T>> gradesList = new ArrayList<>();

    public synchronized void addGrade(StudentGrade<T> grade) {
        if (grade.getGrade().doubleValue() < 0) {
            throw new InvalidGradeException("The Grade is incorrect!");
        }
        gradesList.add(grade);
    }

    public List<StudentGrade<T>> getGradesList() {
        return gradesList;
    }

    public double calculateAvgGrade() {
        if (gradesList.isEmpty()) {
            return 0;
        }
        double sum = 0;
        for (StudentGrade<T> grade : gradesList) {
            sum = sum + grade.getGrade().doubleValue();
        }
        return sum / gradesList.size();
    }

}
