package mock_prep.OOPTasks.map_tasks.warehouse;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> products;

    public Warehouse() {
        products = new HashMap<>();
    }

    public void addProduct(String name, int quantity) {
        int currentQuantity = products.getOrDefault(name, 0);
        products.put(name, currentQuantity + quantity);
    }

    public void removeProduct(String name, int quantity) {
        int currentQuantity = products.getOrDefault(name, 0);
        if (quantity > currentQuantity) {
            return;
        }
        int newQuantity = currentQuantity - quantity;
        if (newQuantity == 0) {
            products.remove(name);
        } else {
            products.put(name, newQuantity);
        }
    }

    public int getQuantity(String name) {
        return products.getOrDefault(name, 0);
    }

    public int getProductsCount() {
        return products.size();
    }

    public boolean containsProduct(String name) {
        return products.containsKey(name);
    }

}

