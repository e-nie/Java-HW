package mock_prep.OOPTasks.composition_aggregation.order_system;

public class OrderItem {
    private String name;
    private double price;
    private int quantity;

    public OrderItem(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double getTotalPrice(){
        return price * quantity;
    }
}
