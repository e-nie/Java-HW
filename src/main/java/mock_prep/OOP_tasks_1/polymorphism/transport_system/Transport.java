package mock_prep.OOP_tasks_1.polymorphism.transport_system;

public abstract class Transport {
    private String name;

    public Transport(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    abstract void move();
}
