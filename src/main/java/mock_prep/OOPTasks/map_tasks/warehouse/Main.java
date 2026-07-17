package mock_prep.OOPTasks.map_tasks.warehouse;

public class Main {
    static void main(String[] args) {
        Warehouse warehouse = new Warehouse();

        warehouse.addProduct("Phone", 5);
        warehouse.addProduct("Table", 10);
        warehouse.addProduct("Radio", 7);
        warehouse.addProduct("Chair", 2);
        warehouse.addProduct("Laptop", 1);

        System.out.println(warehouse.getProductsCount());//5

        warehouse.removeProduct("Phone", 4);//
        System.out.println(warehouse.getQuantity("Phone"));//1
        warehouse.removeProduct("Phone", 1);//
        System.out.println(warehouse.getQuantity("Phone"));//0

        System.out.println(warehouse.containsProduct("Phone"));//false
        System.out.println(warehouse.containsProduct("Laptop"));//true


        System.out.println(warehouse.getProductsCount());//4



    }
}
