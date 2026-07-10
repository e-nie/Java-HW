package mock_prep.OOPTasks.polymorphism.delivery_system;

import java.util.List;

public class DeliverySystem {
    public void deliverAll(List<Delivery> deliveries) {
        for(Delivery delivery : deliveries) {
            delivery.deliver();
        }
    }
}
