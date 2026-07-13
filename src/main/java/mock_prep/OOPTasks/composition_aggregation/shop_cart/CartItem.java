package mock_prep.OOPTasks.composition_aggregation.shop_cart;

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
        return quantity;
    }

    public void changeQuantity(int quantity){
         this.quantity = quantity;
    }

    public double getTotal(){
        return product.getPrice() * quantity;
    }

    @Override
    public String toString(){
        return product.getTitle() + " - " + quantity + " x " + product.getPrice() + " = " + getTotal();
    }
}
