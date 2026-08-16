package mock_OOP_05082026;

import java.util.List;

public class DeliveryService {

    public void sendAll(List<Delivery> deliveryList) {
        for(Delivery delivery: deliveryList){
            delivery.deliver();
        }
        System.out.println("All deliveries have been dispatched");
    }
}
