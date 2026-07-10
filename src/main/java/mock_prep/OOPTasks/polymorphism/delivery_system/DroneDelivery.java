package mock_prep.OOPTasks.polymorphism.delivery_system;

public class DroneDelivery extends Delivery{
    public DroneDelivery(String address) {
        super(address);
    }

    @Override
    public void deliver() {
        System.out.println("A drone flies to the delivery address ");
    }
}
