package homework.OOP_principles_in_Java.task_1;

public class Elephant extends Animal {
    @Override
    void makeSound() {
        System.out.println("Toot!");
    }

    @Override
    void makeMove() {
        System.out.println("Can walk");
    }

    @Override
    public String toString(){
        return "Elephant";
    }
}
