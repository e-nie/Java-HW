package homework.OOP_principles_in_Java.task_5;

public class Hen extends FarmAnimal {
    @Override
    void produce() {
        System.out.println("A hen gives eggs");
    }

    @Override
    void feed() {
        System.out.println("A hen needs grain");
    }

    @Override
    void care() {
        System.out.println("A hen needs a chicken feeder");
    }
}
