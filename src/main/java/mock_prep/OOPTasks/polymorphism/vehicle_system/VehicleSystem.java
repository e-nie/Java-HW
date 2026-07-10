package mock_prep.OOPTasks.polymorphism.vehicle_system;

import java.util.List;

public class VehicleSystem {
    public void moveAll(List<Vehicle> vehicles){
        for(Vehicle vehicle: vehicles) {
            vehicle.move();
        }
    }

}
