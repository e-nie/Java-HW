package mock_prep.OOP_tasks_1.polymorphism.transport_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Transport auto  = new Auto("Audi");
        Transport velik  = new Fahrrad("BMC");
        Transport samolet  = new Flugzeug("Boeing");

        List<Transport> transportList = new ArrayList<>();
        transportList.add(auto);
        transportList.add(velik);
        transportList.add(samolet);

        TransportSystem system = new TransportSystem();
        system.startAll(transportList);
    }
}
