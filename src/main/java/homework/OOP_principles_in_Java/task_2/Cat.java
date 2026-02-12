package homework.OOP_principles_in_Java.task_2;

public class Cat extends Pet implements Playable{
    @Override
    void eat() {
        System.out.println("Feed with wet food");
    }

    @Override
    public void play() {
        System.out.println("The cat plays with a mouse");
    }
}
