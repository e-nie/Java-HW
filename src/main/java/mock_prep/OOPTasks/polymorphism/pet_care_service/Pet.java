package mock_prep.OOPTasks.polymorphism.pet_care_service;

public abstract class Pet {
    protected String name;

    public Pet(String name) {
        this.name = name;
    }
    public abstract void eat();
    public abstract void sleep();
}
