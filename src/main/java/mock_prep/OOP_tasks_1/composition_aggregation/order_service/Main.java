package mock_prep.OOP_tasks_1.composition_aggregation.order_service;

public class Main {
    static void main(String[] args) {
        Item item1 = new Item("chair", 100, 5);//500
        Item item2 =  new Item("table", 200, 4 );//800
        Item item3 = new Item("lamp", 300, 2);//600

        Order order = new Order("1");
        order.addItem(item1);
        order.addItem(item2);
        order.addItem(item3);

        System.out.println( "The total order amount is " + order.calculateOrderTotal());
    }
}
