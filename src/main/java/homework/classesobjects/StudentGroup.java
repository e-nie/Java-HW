package homework.classesobjects;

public class StudentGroup {
    private String groupName;
    private int studentCount;

    public StudentGroup(String newGroupName, int newStudentCount) {
        this.groupName = newGroupName;
        this.studentCount = newStudentCount;
    }

    public String getGroupName() {
        return groupName;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setGroupName(String newGroupName) {
        this.groupName = newGroupName;
    }

    public void setStudentCount(int newStudentCount) {
        this.studentCount = newStudentCount;
    }

    public void printInfo(){
        System.out.println("Group Name: " + groupName + ", Student Count: " + studentCount);
    }

    public static void main(){
        StudentGroup newStudentGroup = new StudentGroup("Kracher", 15);
        newStudentGroup.setStudentCount(55);
        newStudentGroup.printInfo();
    }
}
