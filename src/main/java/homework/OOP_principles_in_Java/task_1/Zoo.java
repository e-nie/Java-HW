package homework.OOP_principles_in_Java.task_1;

public class Zoo {
    private Animal animal;

    public void addAnimal(Animal animal) {
        this.animal = animal;
        System.out.println("Animal: " + animal + " was added to the Zoo");
    }

    public void sayMakeSound() {
        this.animal.makeSound();
    }

    public void sayMakeMove() {
        this.animal.makeMove();
    }

    public void removeAnimal() {
        Animal removedAnimal = this.animal;
        this.animal = null;
        System.out.println("Animal: " + removedAnimal + " was removed from the Zoo");

    }
}
