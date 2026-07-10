package mock_prep.OOPTasks.composition_aggregation.order_system;

public class Main {
    static void main(String[] args) {
        OrderItem item1 = new OrderItem("Laptop", 1000, 3);
        OrderItem item2 = new OrderItem("Mouse", 200, 2);
        OrderItem item3 = new OrderItem("Keyboard", 300, 5);




        Order order = new Order("100");
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        System.out.println(order.calculateTotal());
    }
}
