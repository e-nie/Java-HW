package mock_prep.OOPTasks.polymorphism.pet_care_service;

public class PetDragon extends Pet {
    public PetDragon(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats coal.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps in a cave.");
    }

}
