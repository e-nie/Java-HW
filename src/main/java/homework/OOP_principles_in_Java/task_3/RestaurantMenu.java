package homework.OOP_principles_in_Java.task_3;

public class RestaurantMenu {
    private Dish dish;

    public void addDish(Dish dish) {
        this.dish = dish;
        System.out.println("Log: Dish has been added");
    }

    public void printCharacteristics() {
        dish.showCharacteristics();
        System.out.println("Log: Characteristics are printed");
    }
}
