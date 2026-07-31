package mock_prep.OOP_tasks_1.object_state_lifecycle.shop_order;

public class Order {
    private String orderNumber;
    private OrderStatus status;

    public Order(String orderNumber) {
        this.orderNumber = orderNumber;
        this.status = OrderStatus.CREATED;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public OrderStatus getStatus() {
        return status;
    }


    public void pay() {
        if (isClosed()) {
            System.out.println("Error! The status cannot be changed after delivery or cancellation");
            return;
        }
        if (status == OrderStatus.CREATED) {
            this.status = OrderStatus.PAID;
        } else {
            System.out.println("Error! Only an existing order can be paid");
        }
    }

    public void ship() {
        if (isClosed()) {
            System.out.println("Error! The status cannot be changed after delivery or cancellation");
            return;
        }
        if (this.status == OrderStatus.PAID) {
            this.status = OrderStatus.SHIPPED;
        } else {
            System.out.println("Error! The order must be paid before shipping!");
        }
    }

    public void deliver() {
        if (isClosed()) {
            System.out.println("Error! The status cannot be changed after delivery or cancellation");
            return;
        }
        if (this.status == OrderStatus.SHIPPED) {
            this.status = OrderStatus.DELIVERED;
        }
    }

    public void cancel() {
        if (isClosed()) {
            System.out.println("Error! The status cannot be changed after delivery or cancellation");
            return;
        }
        if (this.status == OrderStatus.PAID) {
            this.status = OrderStatus.CANCELLED;
        }
    }

    public boolean isClosed() {
        return status == OrderStatus.DELIVERED || status == OrderStatus.CANCELLED;
    }
}
