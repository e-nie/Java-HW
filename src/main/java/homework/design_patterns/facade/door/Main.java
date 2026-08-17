package homework.design_patterns.facade.door;

public class Main {
    static void main(String[] args) {

        DoorFacade door = new DoorFacade();
        door.openDoor();
        door.closeDoor();
        door.lockDoor();
    }
}
