package mock_OOP_05082026;

public class DroneDelivery extends Delivery {
    public DroneDelivery(String address) {
        super(address);
    }

    @Override
    public void deliver(){
        System.out.println("Дрон летит с посылкой на " + getAddress());
    }
}
