package homework.design_patterns.facade.smart_home;

public class Main {
    static void main(String[] args) {
        SmartHomeFacade smartHome = new SmartHomeFacade();
        smartHome.turnOnAll();
        smartHome.turnOffAll();
    }
}
