package mock_prep.OOP_tasks_1.composition_aggregation.order_service;

public class Item {
    private String title;
    private double price;
    private int quantity;

    public Item(String title, double price, int quantity) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return  title + " " + price + " " + quantity;
    }

}
