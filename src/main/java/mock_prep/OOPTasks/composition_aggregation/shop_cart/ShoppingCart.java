package mock_prep.OOPTasks.composition_aggregation.shop_cart;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<CartItem> items;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addProduct(Product product, int quantity) {
        CartItem cartItem = new CartItem(product, quantity);
        items.add(cartItem);
    }

    public void removeProduct(String productName) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().getTitle().equals(productName)) {
                items.remove(i);
                return;
            }
        }
    }

    public void changeQuantity(String productName, int quantity) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().getTitle().equals(productName)) {
                if (quantity == 0) {
                    items.remove(i);
                } else {
                    items.get(i).changeQuantity(quantity);
                }
            return;
            }
        }
    }

    public double calculateTotal() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotal();
        }
        return total;
    }

    public void showItems() {
        for (CartItem item : items) {
            System.out.println(item);
        }
    }
}































