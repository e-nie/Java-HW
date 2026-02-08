package practice_5.task_2;

public class Main {
    static void main(String[] args) {
        Item cup = new Item("Espresso cup", 50, 20);
        Item electronics = new Electronics("LED Mask", 400, 2);
        Item dress = new Clothes("Miuccia Dress", 1500, 3);

        Manager evchen = new Manager();

        evchen.manage(cup);
        evchen.manage(electronics);
        evchen.manage(dress);
    }
}
