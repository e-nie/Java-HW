package homework.design_patterns.facade.door;

public class DoorFacade {
    private DoorOpener opener;
    private DoorCloser closer;
    private DoorLocker locker;

    public DoorFacade(){
        this.opener = new DoorOpener();
        this.closer = new DoorCloser();
        this.locker  = new DoorLocker();
    }

    public void openDoor(){
        opener.open();
    }

    public void closeDoor(){
        closer.close();
    }

    public void lockDoor(){
        locker.lock();
    }
}
