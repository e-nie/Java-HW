package mock_prep.OOPTasks.polymorphism.vehicle_system;

public class Bicycle extends Vehicle{

    public Bicycle(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The bicycle " + getName() + " pedals forward!");
    }
}
