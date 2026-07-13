package mock_prep.OOPTasks.composition_aggregation.university;

public class StudentRecord {
    private Student student;
    private String recordBookNumber;
    private double averageGrade;

    public StudentRecord(Student student, String recordBookNumber) {
        this.student = student;
        this.recordBookNumber = recordBookNumber;
        this.averageGrade = 0.0;
    }

    public void updateAverageGrade(double newAverageGrade) {
        this.averageGrade = newAverageGrade;
    }

    public String getRecordBookNumber() {
        return recordBookNumber;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    @Override
    public String toString() {
        return student.getName() + " -  " + recordBookNumber + " - " + averageGrade;
    }
}
