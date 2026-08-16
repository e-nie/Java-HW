package mock_OOP_05082026;

public class PostDelivery extends Delivery {
    public PostDelivery(String address) {
        super(address);
    }

    @Override
    public void deliver(){
        System.out.println(" Почта отправила посылку через сортировочный центр " + getAddress());
    }
}
