package mock_prep.OOPTasks.object_state_lifecycle.internet_order;

public class Order {
    private String orderID;
    private OrderStatus status;

    public Order(String orderID) {
        this.orderID = orderID;
        status = OrderStatus.CREATED;
        System.out.println("Order " + orderID + " has been created");
    }

    public void pay(){
        if (status == OrderStatus.CREATED){
            status = OrderStatus.PAID;
            System.out.println("Order " + orderID + " has been paid");
        }
    }

    public void ship(){
        if(status == OrderStatus.PAID){
            status = OrderStatus.SHIPPED;
            System.out.println("Order " + orderID + " has been shipped");
        } else {
            System.out.println("The order cannot be shipped, please pay the order");
        }
    }

    public void deliver(){
        if(status == OrderStatus.SHIPPED){
            status = OrderStatus.DELIVERED;
            System.out.println("Order " + orderID + " has been delivered");
        } else {
            System.out.println("The order has not been shipped yet");
        }
    }

    public void cancel(){
        if(status == OrderStatus.CREATED || status == OrderStatus.PAID){
            status = OrderStatus.CANCELLED;
            System.out.println("Order " + orderID + " has been canceled");
        }
    }

    public OrderStatus getStatus() {
        return status;

    }
}
