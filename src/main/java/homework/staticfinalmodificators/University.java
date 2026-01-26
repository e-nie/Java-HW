package homework.staticfinalmodificators;

public class University {
    static String universityName = "MIT";
    final int studentID;
    String studentName;

    public University(int newStudentID, String newStudentName) {
        this.studentID = newStudentID;
        this.studentName = newStudentName;
    }

    public static void changeUniversityName(String newName) {
        universityName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void printStudentInfo() {
        System.out.println("University Name: " + universityName + ", Students Name: " + getStudentName() + ", Student ID: " + studentID);
    }

    public static void main(String[] args) {
        University s1 = new University(15, "Ian");
        University s2 = new University(16, "Wolf");
        University s3 = new University(17, "Eric");
        changeUniversityName("NewUniName");
        s1.printStudentInfo();
    }

}
