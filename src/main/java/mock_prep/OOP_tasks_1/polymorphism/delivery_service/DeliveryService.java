package mock_prep.OOP_tasks_1.polymorphism.delivery_service;

import java.util.List;

public class DeliveryService {

    public void sendAll(List<Delivery> deliveryList){
        for( Delivery delivery: deliveryList){
            delivery.deliver();
        }
    }
}
