package homework.design_patterns.builder.internet_shop;

public class ProductItem {
    private Product product;
    private int quantity;

    public ProductItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString(){
        return product.getName() + ", price: " + product.getPrice() + ", quantity: " + quantity;
    }
}
