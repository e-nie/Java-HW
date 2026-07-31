package mock_prep.OOP_tasks_1.object_state_lifecycle.shop_order;

public class Main {
    static void main(String[] args) {
        Order order1 = new Order("001");
        System.out.println(order1.getStatus());
        order1.pay();
        System.out.println(order1.getStatus());

        order1.ship();
        System.out.println(order1.getStatus());

//        order1.deliver();
//        System.out.println(order1.getStatus());

        order1.ship();
        order1.cancel();

    }
}
