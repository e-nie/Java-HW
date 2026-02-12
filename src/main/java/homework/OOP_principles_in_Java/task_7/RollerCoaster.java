package homework.OOP_principles_in_Java.task_7;

public class RollerCoaster implements AttractionMachine{
    @Override
    public void maintenance() {
        System.out.println("Check safety!!!");
    }

    @Override
    public void showInfo() {
        System.out.println("Scare the shit out of you!");
    }
}
