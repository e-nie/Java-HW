package homework.design_patterns.facade.smart_home;

public class AirConditioner implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("AirConditioner is on");

    }

    @Override
    public void turnOff() {
        System.out.println("AirConditioner is off");
    }
}
