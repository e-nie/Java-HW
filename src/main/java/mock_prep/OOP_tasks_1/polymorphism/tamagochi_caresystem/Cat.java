package mock_prep.OOP_tasks_1.polymorphism.tamagochi_caresystem;

public class Cat extends Pet{

    public Cat(String name){
        super(name);
    }

    public void sleep(){
        System.out.println( "Cat " + name + " sleeps on the couch");
    }

    public void eat(){
        System.out.println( "Cat " + name + " eats fish");
    }
}
