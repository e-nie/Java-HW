package mock_prep.OOPTasks.polymorphism.delivery_system;

public class PostDelivery extends Delivery {
    public PostDelivery(String address) {
        super(address);
    }

    @Override
    public void deliver() {
        System.out.println("A parcel goes through a sorting center");
    }
}
