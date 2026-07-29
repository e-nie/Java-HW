package mock_prep.OOP_tasks_1.composition_aggregation.internet_shopping_cart;

public class Product {
    private String name;
    private double price;
    private String SQU;

    public Product(String name, double price, String squ) {
        this.name = name;
        this.price = price;
        this.SQU = squ;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
