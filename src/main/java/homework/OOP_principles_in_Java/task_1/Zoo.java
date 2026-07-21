package homework.OOP_principles_in_Java.task_1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    public Zoo() {
        animals = new ArrayList<>();
    }

    public void addAnimal(Animal animal) {
        if (animal == null) {
            throw new IllegalArgumentException("Animal cannot be null");
        }

        animals.add(animal);
        System.out.println("Animal: " + animal + " was added to the Zoo");
    }

    public void makeAnimalsSound() {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }

    public void makeAnimalsMove() {
        for (Animal animal : animals) {
            animal.makeMove();
        }
    }

    public void removeAnimal(Animal animal) {
        animals.remove(animal);
        System.out.println("Animal: " + animal + " was removed from the Zoo");

    }
}
