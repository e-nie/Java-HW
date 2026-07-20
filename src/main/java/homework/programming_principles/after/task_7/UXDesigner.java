package homework.programming_principles.after.task_7;

public class UXDesigner implements Worker, Eater {

    @Override
    public void eat() {
        System.out.println("The  Designer has his lunch in the office kitchen");
    }

    @Override
    public void work() {
        System.out.println("The Designer works at his table");
    }
}
