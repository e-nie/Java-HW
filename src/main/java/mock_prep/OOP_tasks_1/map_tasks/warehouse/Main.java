package mock_prep.OOP_tasks_1.map_tasks.warehouse;

public class Main {
    static void main(String[] args) {
         Warehouse warehouse = new Warehouse();
         warehouse.addProduct("Table", 5);
         warehouse.addProduct("Window", 5);
         warehouse.addProduct("Roof", 5);
         warehouse.addProduct("Pipe", 45);
         warehouse.addProduct("Floor", 5);

        System.out.println(warehouse.getProductsCount());
        System.out.println(warehouse.containsProduct("Wall"));//false
        System.out.println(warehouse.containsProduct("Table"));//true
        System.out.println(warehouse.getQuantity("Pipe"));
        warehouse.removeProduct("Table", 5);
        System.out.println(warehouse.containsProduct("Table"));
        System.out.println(warehouse);
        warehouse.printProducts();
    }
}
