package homework.complex_tasks.task_5;

import java.util.*;

public class ProductService {
    private boolean isInventoryOpen = true;
    //ключ — это категория товара, а значение — список продуктов в этой категории.
    private Map<String, List<Product>> inventory = new HashMap<>();

    public void setInventoryOpen(boolean inventoryOpen){
        isInventoryOpen = inventoryOpen;

    }

    public Map<String, List<Product>> getInventory() {
        return inventory;
    }

    public void addProduct(Product product) {
        if (!isInventoryOpen) {
            return;
        }
        inventory.putIfAbsent(
                product.getCategory(),// get category from this product if not exists yet and PUT
                new ArrayList<>() //create list for products in this category
        );
        inventory.get(product.getCategory())
                .add(product);

    }

    public List<Product> getProductByCategory(String category) {
        if (!inventory.containsKey(category)) {
            throw new OutOfStockException("No product in category: " + category);
        }
        return inventory.get(category);
    }

    public List<Product> shouldFilterProductsByPrice(double maxPrice) {
        return inventory.values().stream()
                .flatMap(List::stream)
                .filter(product -> product.getPrice() <= maxPrice)
                .toList();
    }
}
