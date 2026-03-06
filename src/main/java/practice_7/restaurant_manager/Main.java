package practice_7.restaurant_manager;

public class Main {
    static void main(String[] args) {
        RestaurantManager manager = new RestaurantManager();

        manager.addNewOrder("Salad");
        manager.addNewOrder("Roasted Beef");
        manager.addNewOrder("Magret Canard");
        manager.addNewOrder("Blackberry Pie");
        manager.addNewOrder("French Fries");
        manager.addNewOrder("Spaghetti");
        manager.addNewOrder("Pizza");
        manager.printOrders();

        manager.deleteOrder("French Fries");

//        String nextOrder = manager.getNextOrderForProcessing();
//        System.out.println("Processing: " + nextOrder);
//     manager.getNextOrderForProcessing();
        manager.printOrders();
    }
}
