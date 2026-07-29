package mock_prep.OOP_tasks_1.polymorphism.delivery_service;

public abstract class Delivery {
    protected String deliveryAddress;

    public Delivery(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public abstract void deliver();
}
