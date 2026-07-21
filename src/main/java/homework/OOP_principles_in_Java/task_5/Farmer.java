package homework.OOP_principles_in_Java.task_5;

import java.util.ArrayList;
import java.util.List;

public class Farmer {
    private List<FarmAnimal> farmAnimals;

    public Farmer() {
        farmAnimals = new ArrayList<>();
    }


    public void addAnimal(FarmAnimal farmAnimal) {
        if (farmAnimal == null) {
            throw new IllegalArgumentException();
        }
        farmAnimals.add(farmAnimal);
        System.out.println("The animal " + farmAnimal + " has been added");
    }

    public void printAnimalInfo() {
        for (FarmAnimal farmAnimal : farmAnimals) {
            farmAnimal.produce();
            farmAnimal.feed();
            farmAnimal.care();

        }
    }
}
