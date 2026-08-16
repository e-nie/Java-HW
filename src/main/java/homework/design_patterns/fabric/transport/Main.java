package homework.design_patterns.fabric.transport;

public class Main {
    static void main(String[] args) {

        TransportFactory carFactory = new CarFactory();
        Transport car  = carFactory.createTransport();

        TransportFactory bicycleFactory = new BicycleFactory();
        Transport bicycle  = bicycleFactory.createTransport();

        car.move();
        bicycle.move();
    }
}
