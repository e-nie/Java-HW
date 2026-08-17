package homework.design_patterns.facade.smart_home;

public class SmartHomeFacade {
    private Light light;
    private AirConditioner airConditioner;
    private SecuritySystem securitySystem;

    public SmartHomeFacade() {
        light = new Light();
        airConditioner = new AirConditioner();
        securitySystem = new SecuritySystem();
    }

    public void turnOnAll(){
        light.turnOn();
        airConditioner.turnOn();
        securitySystem.turnOn();
    }

    public void turnOffAll(){
        light.turnOff();
        airConditioner.turnOff();
        securitySystem.turnOff();
    }
}
