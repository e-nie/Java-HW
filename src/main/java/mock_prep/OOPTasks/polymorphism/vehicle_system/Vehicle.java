package mock_prep.OOPTasks.polymorphism.vehicle_system;

public abstract class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void move();
}
