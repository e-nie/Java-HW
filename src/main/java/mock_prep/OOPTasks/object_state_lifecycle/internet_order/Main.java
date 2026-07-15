package mock_prep.OOPTasks.object_state_lifecycle.internet_order;

public class Main {
    static void main(String[] args) {
        Order order1 = new Order("001");
        System.out.println("Order status - " + order1.getStatus());
        System.out.println();

        order1.pay();
        System.out.println("Order status - " + order1.getStatus());
        System.out.println();

        order1.ship();
        System.out.println("Order status - " + order1.getStatus());
        System.out.println();

        order1.deliver();
        System.out.println("Order status - " + order1.getStatus());
        System.out.println();

        order1.cancel();
        System.out.println("Order status - " + order1.getStatus());
        System.out.println();

        Order order2 = new Order("002");

        System.out.println("Order status - " + order2.getStatus());
        order2.pay();
        System.out.println("Order status - " + order2.getStatus());
        System.out.println();
        order2.cancel();
        System.out.println("Order status - " + order2.getStatus());

    }
}
