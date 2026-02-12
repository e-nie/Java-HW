package homework.OOP_principles_in_Java.task_1;

public class Bird extends Animal {
    @Override
    void makeSound() {
        System.out.println("Chirp-chirp!");
    }

    @Override
    void makeMove() {
        System.out.println("Fly");
    }

    @Override
    public String toString(){
        return "Bird";
    }
}
