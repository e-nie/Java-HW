package mock_prep.OOP_tasks_1.composition_aggregation.internet_shopping_cart;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addProduct(Product product, int quantity) {
        CartItem item = new CartItem(product, quantity);
        items.add(item);
    }

    public void removeProduct(String name) {
        if (name == null) {
            return;
        }
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getProduct().getName().equals(name)) {
                items.remove(i);
                return;
            }
        }

    }

    public void changeQuantity(String name, int quantity) {
        for (int i = 0; i < items.size(); i++) {
            CartItem item = items.get(i);
            if (item.getProduct().getName().equals(name)) {
                item.changeQuantity(quantity);
                if (item.getQuantity() == 0) {
                    items.remove(i);
                }
                return;
            }
        }
    }

    public double calculateTotal() {
        double sum = 0;
        for (CartItem item : items) {
            sum += item.getTotal();
        }
        return sum;
    }

    public void showItems() {
        for (CartItem item : items) {
            System.out.println("Product: " + item.getProduct().getName() + ",  price: " + item.getProduct().getPrice() +
                    ", quantity: " + item.getQuantity());
        }
    }
}
