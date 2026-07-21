package homework.OOP_principles_in_Java.task_4;

import java.util.ArrayList;
import java.util.List;

public class AquariumManager {
    private List<SeaCreature> seaCreatures;

    public AquariumManager(){
        seaCreatures = new ArrayList<>();
    }

    public void addSeaCreature(SeaCreature creature) {
        if(creature == null){
            throw new IllegalArgumentException("The sea creature cannot be null!");
        }
       seaCreatures.add(creature);
        System.out.println("Log: New Sea Creature added");
    }

    public void showBehaviour(){
        for(SeaCreature creature: seaCreatures){
            creature.move();
        }
        System.out.println("Log: Behaviour shown");
    }
}
