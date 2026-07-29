package mock_prep.OOP_tasks_1.composition_aggregation.order_service;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private List<Item> itemList;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        itemList = new ArrayList<>();
    }

    public void addItem(Item item) {
        itemList.add(item);
        System.out.println("The item: " + item.getTitle() + ", price: " + item.getPrice() + ", quantity: " + item.getQuantity() +  ", has been added!");
    }

    public double calculateOrderTotal() {
        double sum = 0;
        for (Item item : itemList) {
            sum += item.getPrice() * item.getQuantity();
        }
        return sum;

    }
}
