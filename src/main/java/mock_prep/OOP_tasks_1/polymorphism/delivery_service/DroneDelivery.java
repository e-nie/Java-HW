package mock_prep.OOP_tasks_1.polymorphism.delivery_service;

public class DroneDelivery extends Delivery {
    public DroneDelivery(String deliveryAddress) {
        super(deliveryAddress);
    }

    @Override
    public void deliver() {
        System.out.println("The drone delivers the parcel to " + deliveryAddress);
    }
}
