package mock_prep.OOP_tasks_1.polymorphism.tamagochi_caresystem;

public class Dragon extends Pet{

    public Dragon(String name){
        super(name);
    }

    public void sleep(){
        System.out.println("Dragon " + name + " sleeps in the cave");
    }

    public void eat(){
        System.out.println("Dragon " + name + " eats young women");
    }
}
