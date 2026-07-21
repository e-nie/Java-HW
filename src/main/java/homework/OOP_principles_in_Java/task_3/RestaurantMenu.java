package homework.OOP_principles_in_Java.task_3;

import java.util.ArrayList;
import java.util.List;

public class RestaurantMenu {
    private List<Dish> dishes;
    public RestaurantMenu(){
        dishes = new ArrayList<>();
    }


    public void addDish(Dish dish) {
        if(dish == null) {
            throw new IllegalArgumentException("The dish cannot be null!");
        }
        this.dishes.add(dish);
        System.out.println("Log: Dish has been added");
    }

    public void printCharacteristics() {
        for(Dish dish:dishes)
         dish.showCharacteristics();
        System.out.println("Log: Characteristics are printed");
    }
}
