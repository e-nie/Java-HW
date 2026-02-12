package homework.OOP_principles_in_Java.task_2;

public class Dog extends Pet implements Walkable{
    @Override
    void eat() {
        System.out.println("Feed with dry food");
    }

    @Override
    public void walk() {
        System.out.println("The dog goes for a walk");
    }
}
