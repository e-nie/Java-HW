package mock_prep.OOP_tasks_1.polymorphism.delivery_service;

public class CourierDelivery extends Delivery {
    public CourierDelivery(String deliveryAddress) {
        super(deliveryAddress);
    }

    @Override
    public void deliver() {
        System.out.println("The courier deliver the parcel to " + deliveryAddress);
    }
}
