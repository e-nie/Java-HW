package mock_prep.OOPTasks.polymorphism.pet_care_service;

public class PetCat extends Pet {
    public PetCat(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(name + " eats fish.");
    }

    @Override

    public void sleep() {
        System.out.println(name + " sleeps on the windowsill.");
    }

}
