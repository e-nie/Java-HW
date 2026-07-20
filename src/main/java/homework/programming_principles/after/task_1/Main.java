package homework.programming_principles.after.task_1;

public class Main {
    static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();
        System.out.println(mathOperations.add(2,3));//5
        System.out.println(mathOperations.add(2,3, 3));//8
        System.out.println(mathOperations.add(2,3, 3,2));//10
    }
}
