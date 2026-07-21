package homework.OOP_principles_in_Java.task_6;

import java.util.ArrayList;
import java.util.List;

public class BotanicalGarden {
    private List<Plant> plants;

    public BotanicalGarden() {
        plants = new ArrayList<>();
    }

    public void addPlant(Plant plant) {
        if (plant == null) {
            throw new IllegalArgumentException("The plant cannot be null!");
        }
        plants.add(plant);
        System.out.println("Plant " + plant + "  has been added!");
    }

    public void maintainPlant() {
        for (Plant plant : plants) {
            plant.care();
            System.out.println("Plant " + plant + " has been cared of!");

        }
    }
}
