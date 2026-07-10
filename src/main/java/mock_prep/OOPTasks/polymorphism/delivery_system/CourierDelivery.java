package mock_prep.OOPTasks.polymorphism.delivery_system;

public class CourierDelivery extends Delivery{
    public CourierDelivery(String address) {
        super(address);
    }

    @Override
    public void deliver() {
        System.out.println("A courier delivers parcels by car ");
    }
}
