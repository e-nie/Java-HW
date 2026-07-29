package mock_prep.OOP_tasks_1.polymorphism.delivery_service;

public class POstDelivery extends Delivery {
    public POstDelivery(String deliveryAddress) {
        super(deliveryAddress);
    }

    @Override
    public void deliver() {
        System.out.println("The post sends the parcel through a sorting center to " + deliveryAddress);
    }
}
