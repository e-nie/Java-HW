package mock_prep.OOPTasks.composition_aggregation.shop_cart;

public class Product {
    private String title;
    private double price;
    private String squ;

    public Product(String title, double price, String squ) {
        this.title = title;
        this.price = price;
        this.squ = squ;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getSqu() {
        return squ;
    }
}
