package mock_prep.OOPTasks.polymorphism.vehicle_system;

public class Car extends Vehicle{

    public Car(String name) {
        super(name);
    }

    @Override
    public void move() {
        System.out.println("The " + getName() + " speeds down the autobahn!");
    }
}
