package mock_prep.OOPTasks.map_tasks.gradebook;

public class Main {
    static void main(String[] args) {
        GradeBook gradeBook = new GradeBook();

        gradeBook.addGrade("Ann", 5);
        gradeBook.addGrade("Ann", 4);
        gradeBook.addGrade("Ann", 1);
        gradeBook.addGrade("Ben", 5);
        gradeBook.addGrade("Ben", 1);
        gradeBook.addGrade("Shen", 5);

        System.out.println(gradeBook.getGrades("Ann"));
        System.out.println(gradeBook.getAverageGrade("Ann"));
        System.out.println(gradeBook.containsStudent("Shen"));
        System.out.println(gradeBook.containsStudent("Tom"));
        System.out.println(gradeBook.getStudentsCount());

        System.out.println(gradeBook.getAverageGrade("Tom"));
    }
}
