package homework.OOP_principles_in_Java.task_3;


/**
 * 3. Управление рестораном
 * Условие:
 * В меню ресторана добавляется блюдо.
 * У каждого блюда свои параметры отображения:
 * Горячее блюдо — с температурой
 * Напиток — с объёмом
 * Нужно спроектировать систему, в которой можно добавлять блюда и выводить их описание с учётом характеристик.
 * <p>
 * <p>
 * Entities: restaurant, dish (hot dish & drink)
 * Properties, actions, relationships:
 * dish - no properties, actions - show description with its characteristics
 * dish subtypes: inheritance -
 * Fields:
 * hot dish - property T, action - show description (T)
 * drink - property volume, action - show description (volume)
 * Actions: show description
 * <p>
 * restaurant - dish
 * show menu (description of a dish)
 * update dish
 *
 *
 *
 *
 */
public class Main {
    static void main(String[] args) {
        MainCourse steak = new MainCourse(40);

        RestaurantMenu menu = new RestaurantMenu();
        menu.addDish(steak);
        menu.printCharacteristics();

        Drink mochito = new Drink(300);
        menu.addDish(mochito);
        menu.printCharacteristics();
    }
}
