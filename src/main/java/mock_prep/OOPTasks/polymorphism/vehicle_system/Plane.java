package mock_prep.OOPTasks.polymorphism.vehicle_system;

public class Plane extends Vehicle{

    public Plane(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("A " + getName() + " climbs into the sky!");
    }
}
