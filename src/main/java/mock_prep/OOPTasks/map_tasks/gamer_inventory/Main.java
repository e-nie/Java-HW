package mock_prep.OOPTasks.map_tasks.gamer_inventory;

public class Main {
    static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addInventory("Table", 10);
        inventory.addInventory("Chair", 10);
        inventory.addInventory("Shelf", 3);
        inventory.addInventory("Lamp", 2);

        inventory.useItem("Table");
        System.out.println(inventory.getQuantity("Table"));
        System.out.println(inventory.containsItem("Chair"));//true
        System.out.println(inventory.containsItem("Cat"));//false

        inventory.useItem("Lamp");
        System.out.println(inventory.getQuantity("Lamp"));//1
        inventory.useItem("Lamp");
        System.out.println(inventory.getQuantity("Lamp"));//0

        System.out.println(inventory.getItemsCount());//3

    }

}
