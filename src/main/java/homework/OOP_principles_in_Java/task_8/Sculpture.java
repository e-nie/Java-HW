package homework.OOP_principles_in_Java.task_8;

public class Sculpture implements Exhibit{
    @Override
    public void preserveMethod() {
        System.out.println("Preservation method: The sculpture needs regular restoration");
    }

    @Override
    public void showExhibitInfo() {
        System.out.println("The exhibit name: Original ancient Greek sculpture");
    }
}
