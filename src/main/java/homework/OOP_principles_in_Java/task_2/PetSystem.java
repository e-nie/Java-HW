package homework.OOP_principles_in_Java.task_2;

public class PetSystem {
    private Pet pet;

    public void addPet(Pet pet) {
        this.pet = pet;
        System.out.println("Log: Pet added");
    }

    public void feedPet() {
        this.pet.eat();
        System.out.println("Log: The pet is fed");
    }

    public void makePetPlay() {
        if (this.pet instanceof Playable) {
            Playable playablePet = (Playable) this.pet;
            playablePet.play();
        } else {
            System.out.println("Error!!! The pet cannot play!");
        }
    }

    public void makePetWalk() {
        if (this.pet instanceof Walkable) {
            Walkable walkablePet = (Walkable) this.pet;
            walkablePet.walk();
        } else {
            System.out.println("Error! The pet cannot walk outside!");
        }
    }
}
