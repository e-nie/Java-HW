package homework.classesobjects;

public class Teacher {
    private String name;
    private String subject;

    public Teacher(String newName, String newSubject) {
        this.name = newName;
        this.subject = newSubject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setSubject(String newSubject) {
        this.subject = newSubject;
    }

    public void printInfo(){
        System.out.println("Name: " + name + ", Subject: " + subject);
    }

    public static void main(String[] args) {
        Teacher newTeacher = new Teacher("Mrs.Doodle", "Kunstgeschichte");
        newTeacher.setSubject("Math");
        newTeacher.printInfo();
    }


}
