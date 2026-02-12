package homework.OOP_principles_in_Java.task_5;

public class Cow extends FarmAnimal {
    @Override
    void produce() {
        System.out.println("Cow gives milk");
    }

    @Override
    void feed() {
        System.out.println("Cow eats grass");
    }

    @Override
    void care() {
        System.out.println("Cow needs to graze");
    }
}
