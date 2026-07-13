package mock_prep.OOPTasks.composition_aggregation.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<StudentRecord> studentsList;

    public University(String name) {
        this.name = name;
        this.studentsList = new ArrayList<>();
    }

    public void enrollStudent(Student newStudent, String recordBookNumber) {
        StudentRecord studentRecord = new StudentRecord(newStudent, recordBookNumber);
        studentsList.add(studentRecord);
    }

    public void expelStudent(String recordBookNumber) {
        for (int i = 0; i < studentsList.size(); i++) {
            if (studentsList.get(i).getRecordBookNumber().equals(recordBookNumber)) {
                studentsList.remove(i);
                return;
            }
        }
    }

    public StudentRecord findStudent(String recordBookNumber) {
        for (StudentRecord record : studentsList) {
            if (record.getRecordBookNumber().equals(recordBookNumber)) {
                return record;
            }
        }
        return null;
    }

    public void showAllStudents() {
        for (StudentRecord student : studentsList) {
            System.out.println(student);
        }
    }

    public double calculateTotalAverageGrade() {
        double totalAverageGrade = 0;
        for (StudentRecord student : studentsList) {
            totalAverageGrade += student.getAverageGrade();
        }
        return totalAverageGrade / studentsList.size();
    }
}

