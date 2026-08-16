package mock_prep.OOP_tasks_1.map_tasks.warehouse;

import java.util.HashMap;
import java.util.Map;

public class Warehouse {
    private Map<String, Integer> products;

    public Warehouse() {
        this.products = new HashMap<>();
    }

    public void addProduct(String name, int quantity) {
        if (containsProduct(name)) {
            products.put(name, products.get(name) + quantity);
        } else {
            products.put(name, quantity);
        }
    }

    public void addProduct1(String name, int quantity) {
        int currentQuantity = products.getOrDefault(name, 0);
        products.put(name, currentQuantity + quantity);
    }

    public boolean containsProduct(String name) {
        return products.containsKey(name);
    }

    public void removeProduct(String name, int quantity) {//не удалить, а уменьшить количество
        if (!containsProduct(name)) {
            System.out.println("Product not found");
            return;
        }

        int currentQuantity = products.get(name);

        if (quantity > currentQuantity) {
            System.out.println("Not enough products in stock");
            return;
        }

        if (quantity == currentQuantity) {
            products.remove(name);
            return;
        }

        products.put(name, currentQuantity - quantity);
    }

    public int getQuantity(String name) {
        return products.getOrDefault(name, 0);
    }

    public int getProductsCount() {
        return products.size();
    }

    public String toString(){
        return products.toString();
    }

    public void printProducts() {
        for (Map.Entry<String, Integer> entry : products.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }
    }
}


