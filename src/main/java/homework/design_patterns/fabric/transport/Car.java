package homework.design_patterns.fabric.transport;

public class Car implements Transport{
    @Override
    public void move() {
        System.out.println("The car moves along the road");
    }
}
