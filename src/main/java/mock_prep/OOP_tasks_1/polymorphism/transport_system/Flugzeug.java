package mock_prep.OOP_tasks_1.polymorphism.transport_system;

public class Flugzeug extends Transport{

    public Flugzeug(String name) {
        super(name);
    }

    @Override
    public void move(){
        System.out.println("Das Flugzeug " + getName() + " fliegt durch die Luft");
    }
}
