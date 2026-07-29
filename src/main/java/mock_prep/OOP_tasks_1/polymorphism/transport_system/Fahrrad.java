package mock_prep.OOP_tasks_1.polymorphism.transport_system;

public class Fahrrad extends Transport{

    public Fahrrad(String name) {
        super(name);
    }

    @Override
    public void move(){
        System.out.println("Das Fahrrad " + getName() + " tritt in die Pedalie");
    }
}
