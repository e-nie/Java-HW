package homework.design_patterns.facade.smart_home;

public class Light implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("Light is on");

    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}
