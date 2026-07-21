package homework.OOP_principles_in_Java.task_2;

public abstract class Pet {
    abstract void eat();

    public void walk() {
        System.out.println("This pet cannot walk");
    }

    public void play() {
        System.out.println("This pet cannot play");
    }
}
