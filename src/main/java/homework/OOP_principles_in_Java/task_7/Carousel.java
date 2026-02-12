package homework.OOP_principles_in_Java.task_7;

public class Carousel implements AttractionMachine{
    @Override
    public void maintenance() {
        System.out.println("Regular technical and safety maintenance");
    }

    @Override
    public void showInfo() {
        System.out.println("Feel yourself a child again!");
    }
}
