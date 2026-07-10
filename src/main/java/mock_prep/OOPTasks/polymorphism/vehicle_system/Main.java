package mock_prep.OOPTasks.polymorphism.vehicle_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Vehicle bicycle = new Bicycle("BMC");
        Vehicle car = new Car("BMW");
        Vehicle plane = new Plane("Lufthansa Boeing 747");


        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(bicycle);
        vehicles.add(car);
        vehicles.add(plane);

        VehicleSystem system = new VehicleSystem();
        system.moveAll(vehicles);


    }
}
