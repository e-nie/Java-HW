package mock_prep.OOP_tasks_1.polymorphism.tamagochi_caresystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Pet cat = new Cat("Lois");
        Pet dog = new Dog("Stasja");
        Pet dragon  = new Dragon("Drago");

        List<Pet> petsList = new ArrayList<>();
        petsList.add(cat);
        petsList.add(dog);
        petsList.add(dragon);

        TamagochiCareSystem system = new TamagochiCareSystem();
        system.feedAll(petsList);
        system.putAllToSleep(petsList);
    }
}
