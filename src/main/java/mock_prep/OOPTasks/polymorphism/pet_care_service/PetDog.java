package mock_prep.OOPTasks.polymorphism.pet_care_service;

public class PetDog extends Pet {
    public PetDog(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats meat.");
    }

    @Override
    public void sleep() {
        System.out.println(name + " sleeps on the couch.");
    }

}
