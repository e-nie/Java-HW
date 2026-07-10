package mock_prep.OOPTasks.composition_aggregation.order_system;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderId;
    private List<OrderItem> orderItems;

    public Order(String orderId) {
        this.orderId = orderId;
        this.orderItems = new ArrayList<>();
    }

    public void addItem(OrderItem item) {
        orderItems.add(item);
    }

    public double calculateTotal() {
        double total = 0;
        for (OrderItem item : orderItems) {
            total += item.getTotalPrice();
        }
        return total;
    }
}
