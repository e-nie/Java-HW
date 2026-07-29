package mock_prep.OOP_tasks_1.polymorphism.transport_system;

public class Auto extends Transport{

    public Auto(String name) {
        super(name);
    }

    @Override
    public void move(){
        System.out.println("Das Auto " + getName() + " is driving down the road");
    }
}
