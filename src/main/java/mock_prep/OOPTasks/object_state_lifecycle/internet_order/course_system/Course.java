package mock_prep.OOPTasks.object_state_lifecycle.internet_order.course_system;

import java.util.HashSet;
import java.util.Set;

public class Course {
    private String courseTitle;
    private Set<String> registeredStudents;
    private Set<String> completedStudents;

    public Course(String courseTitle) {
        this.courseTitle = courseTitle;
        registeredStudents = new HashSet<>();
        completedStudents = new HashSet<>();
    }

    public void registerStudent(String student){
        registeredStudents.add(student);
    }

    public void completeCourse(String student){
       if(isRegistered(student)) {
           registeredStudents.remove(student);
           completedStudents.add(student);
       }
    }

    public boolean isRegistered(String student){
       return registeredStudents.contains(student);
    }

    public boolean isCompleted(String student){
        return completedStudents.contains(student);
    }

    public int getRegisteredCount(){
        return registeredStudents.size();
    }

    public int getCompletedCount(){
        return completedStudents.size();
    }
}
