package homework.OOP_principles_in_Java.task_3;

public class MainCourse extends Dish {
    private int temperature;

    public MainCourse(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }


    @Override
    void showCharacteristics() {
        System.out.println("Main Course Temperature: " + this.temperature);
    }
}
