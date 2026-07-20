package homework.programming_principles.after.task_6;

public class Flamingo extends Bird implements Flyable {
    @Override
    public void move() {
        System.out.println("Flamingo moves and dances very well");
    }

    @Override
    public void fly() {
        System.out.println("Flamingo can fly, but not so high");
    }

}
