package mock_prep.OOP_tasks_1.polymorphism.tamagochi_caresystem;

public abstract class Pet {
    protected String name;

    public Pet(String name){
        this.name = name;
    }

     public abstract void sleep();
     public abstract void eat();
}
