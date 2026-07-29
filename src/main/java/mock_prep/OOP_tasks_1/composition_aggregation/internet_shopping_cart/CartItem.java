package mock_prep.OOP_tasks_1.composition_aggregation.internet_shopping_cart;

public class CartItem {
    private Product product;
    private int quantity;

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void changeQuantity(int newQuantity) {
        this.quantity = newQuantity;
    }

    public double getTotal() {
        return product.getPrice() * this.quantity;
    }
}
