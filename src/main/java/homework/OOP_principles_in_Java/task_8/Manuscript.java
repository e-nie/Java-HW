package homework.OOP_principles_in_Java.task_8;

public class Manuscript implements Exhibit{
    @Override
    public void preserveMethod() {
        System.out.println("Manuscript requires a strict control of air humidity. Keep out of the light");
    }

    @Override
    public void showExhibitInfo() {
        System.out.println("The original Napoleon school notes");
    }
}
