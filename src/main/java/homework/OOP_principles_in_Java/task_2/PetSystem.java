package homework.OOP_principles_in_Java.task_2;

public class PetSystem {
    private Pet pet;

    public void addPet(Pet pet) {
        if (pet == null) {
            throw new IllegalArgumentException("A pet cannot be null!");
        }
        this.pet = pet;
        System.out.println("Log: Pet added");
    }

    public void feedPet() {
        this.pet.eat();
        System.out.println("Log: The pet is fed");
    }

    public void makePetPlay() {
        if (this.pet instanceof Playable) {
            pet.play();
        }
    }

    public void makePetWalk() {
        pet.walk();
    }

}

