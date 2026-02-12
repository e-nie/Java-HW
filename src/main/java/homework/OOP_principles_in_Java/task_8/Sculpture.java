package homework.OOP_principles_in_Java.task_8;

public class Sculpture implements Exhibit{
    @Override
    public void preserveMethod() {
        System.out.println("The sculpture needs regular restoration");
    }

    @Override
    public void showExhibitInfo() {
        System.out.println("Original ancient Greek sculpture");
    }
}
