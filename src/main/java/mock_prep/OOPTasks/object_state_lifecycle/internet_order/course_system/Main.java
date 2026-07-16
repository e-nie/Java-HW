package mock_prep.OOPTasks.object_state_lifecycle.internet_order.course_system;

public class Main {
    static void main(String[] args) {
        Course course = new Course("Deutsch");

        course.registerStudent("Ahmed");
        course.registerStudent("Osama");
        course.registerStudent("Mustafa");
        course.registerStudent("Orkan");
        course.registerStudent("Abdulla");
        course.registerStudent("Muhammad");

        System.out.println(course.getRegisteredCount());
        System.out.println();

        course.completeCourse("Ahmed");
        course.completeCourse("Osama");
        System.out.println(course.getRegisteredCount());
        System.out.println(course.getCompletedCount());
        System.out.println();

        System.out.println(course.isRegistered("Orkan"));
        System.out.println(course.isRegistered("Osama"));
        System.out.println(course.isCompleted("Osama"));




    }
}
