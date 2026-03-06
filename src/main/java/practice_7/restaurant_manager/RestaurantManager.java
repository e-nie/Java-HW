package practice_7.restaurant_manager;

import java.util.LinkedList;

public class RestaurantManager {
    private LinkedList<String> orders;

    public RestaurantManager() {
        this.orders = new LinkedList<>();
    }

    //добавлять заказ в конец очереди
    public void addNewOrder(String order) {
        orders.addLast(order);
    }

    // обрабатывать заказ из начала очереди
    public String getNextOrderForProcessing() {
        return orders.pollFirst();
    }

    // удалять заказ в любом месте очереди
    public void deleteOrder(String order) {
        orders.remove(order);
    }

    public void printOrders(){
        System.out.println("All orders:");

//        orders.forEach(order -> System.out.println(order)); we can shorten this expression:
        orders.forEach(System.out::println);
        System.out.println();//добавляем пустую строку для разделения
    }

}
