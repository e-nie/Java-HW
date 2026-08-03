package mock_prep.OOP_tasks_1.composition_aggregation.university;

import java.util.ArrayList;
import java.util.List;

public class University {
    private String name;
    private List<StudentRecord> studentList;

    public University(String name) {
        this.name = name;
        studentList = new ArrayList<>();
    }

    public void enrollStudent(Student student, String recordBookNumber) {
        StudentRecord newStudent = new StudentRecord(student, recordBookNumber);
        studentList.add(newStudent);
    }

    public void expellStudent(String recordBookNumber) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getRecordNumber().equals(recordBookNumber)) {
                studentList.remove(i);
                return;
            }
        }
        System.out.println("The record number was not found");
    }

    public StudentRecord findStudent(String recordBookNumber) {
        for (StudentRecord record : studentList) {
            if (record.getRecordNumber().equals(recordBookNumber)) {
                return record;
            }
        }
        System.out.println("The student record not found");
        return null;
    }

    public void showStudents() {
        for (StudentRecord record : studentList) {
            System.out.println(record);
        }
    }

    public double calculateAverageGrade() {
        double avg = 0;
        for (StudentRecord record : studentList) {
            avg += record.getAvgGrade();
        }
        return avg/ studentList.size();
    }
}
