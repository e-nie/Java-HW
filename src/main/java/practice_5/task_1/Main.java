package practice_5.task_1;

public class Main {
    static void main(String[] args) {
        Car car = new Car(); //SOLID L - LSP/Liskov Substitution Principle‼️
        Transport ship = new Ship();
        Transport plane = new Plane();

        Dispatcher dispatcher = new Dispatcher();
        dispatcher.control(car);
        dispatcher.printTransportDetails(car);

        dispatcher.control(ship);
        dispatcher.printTransportDetails(ship);

        dispatcher.control(plane);
        dispatcher.printTransportDetails(plane);


    }
}
