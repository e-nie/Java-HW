package mock_OOP_05082026;

public class CourierDelivery extends Delivery {
    public CourierDelivery(String address) {
        super(address);
    }

    @Override
    public void deliver(){
        System.out.println("Курьер доставляет посылку на " + getAddress());
    }
}
