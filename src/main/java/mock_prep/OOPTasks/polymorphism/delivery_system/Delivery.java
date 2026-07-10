package mock_prep.OOPTasks.polymorphism.delivery_system;

public abstract class Delivery {
    protected String address;

    public Delivery(String address) {
        this.address = address;
    }
    public abstract void deliver();
}
