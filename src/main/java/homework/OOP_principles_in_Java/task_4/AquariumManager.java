package homework.OOP_principles_in_Java.task_4;

public class AquariumManager {
    private SeaCreature seaCreature;

    public void addSeaCreature(SeaCreature creature) {
        this.seaCreature = creature;
        System.out.println("Log: New Sea Creature added");
    }

    public void showBehaviour(){
        this.seaCreature.canMove();
        System.out.println("Log: Behaviour shown");
    }
}
