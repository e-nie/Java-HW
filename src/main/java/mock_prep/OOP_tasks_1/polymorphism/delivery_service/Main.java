package mock_prep.OOP_tasks_1.polymorphism.delivery_service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Delivery courier = new CourierDelivery("Paris");
        Delivery drone = new DroneDelivery("Oslo");
        Delivery post = new POstDelivery("Berlin");

        List<Delivery> deliveryList = new ArrayList<>();
        deliveryList.add(courier);
        deliveryList.add(drone);
        deliveryList.add(post);

        DeliveryService service = new DeliveryService();
        service.sendAll(deliveryList);
    }
}
