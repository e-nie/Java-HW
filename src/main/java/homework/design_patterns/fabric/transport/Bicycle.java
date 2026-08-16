package homework.design_patterns.fabric.transport;

public class Bicycle implements Transport {
    @Override
    public void move() {
        System.out.println("The bicycle moves along the country-side");
    }
}
