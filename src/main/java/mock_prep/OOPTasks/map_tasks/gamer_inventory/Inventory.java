package mock_prep.OOPTasks.map_tasks.gamer_inventory;

import java.util.HashMap;
import java.util.Map;

public class Inventory {
    private Map<String, Integer> items;

    public Inventory() {
        items = new HashMap<>();
    }

    public void addInventory(String name, int quantity) {
        int currentQuantity = items.getOrDefault(name, 0);
        items.put(name, currentQuantity + quantity);
    }

    public void useItem(String name) {
        int currentQuantity = items.getOrDefault(name, 0);
        if (currentQuantity == 0) {
            return;
        }
        int newQuantity = currentQuantity - 1;
        items.put(name, newQuantity);
        if (newQuantity == 0) {
            items.remove(name);
        }
    }

    public int getQuantity(String name) {
        return items.getOrDefault(name,0);
    }

    public boolean containsItem(String name) {
        return items.containsKey(name);
    }

    public int getItemsCount() {
        return items.size();
    }
}
