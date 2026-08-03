package mock_prep.OOP_tasks_1.composition_aggregation.university;

public class StudentRecord {
    private Student student;
    private String recordNumber;
    private double avgGrade;

    public StudentRecord(Student student, String recordNumber) {
        this.student = student;
        this.recordNumber = recordNumber;
    }

    public String getRecordNumber() {
        return recordNumber;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void updateAvgGrade(double newAvgGrade) {
        this.avgGrade = newAvgGrade;

    }

    public String toString(){
        return " Name: " + student.getName() + ", record number: " + getRecordNumber() + ", average grade: " + getAvgGrade();
    }
}
