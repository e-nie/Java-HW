package mock_prep.OOP_tasks_1.polymorphism.transport_system;

import java.util.List;

public class TransportSystem {

    public void startAll(List<Transport> transportList){
        for(Transport transport : transportList){
            transport.move();
        }
    }
}
