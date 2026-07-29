package mock_prep.OOP_tasks_1.polymorphism.tamagochi_caresystem;

public class Dog extends Pet{

    public Dog(String name){
        super(name);
    }

    public void sleep(){
        System.out.println("Dog " + name + " sleeps on the master's bed");
    }

    public void eat(){
        System.out.println("Dog " + name + " eats meat");
    }
}
