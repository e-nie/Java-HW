package homework.design_patterns.facade.smart_home;

public class SecuritySystem implements Switchable{
    @Override
    public void turnOn() {
        System.out.println("SecuritySystem is on");

    }

    @Override
    public void turnOff() {
        System.out.println("SecuritySystem is off");
    }
}
