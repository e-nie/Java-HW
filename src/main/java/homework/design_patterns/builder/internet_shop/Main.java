package homework.design_patterns.builder.internet_shop;

public class Main {
    static void main(String[] args) {
        Product display = new Product("Display", 1_000.0);
        Product chair = new Product("Working chair", 800.0);
        Product keyboard = new Product("Keyboard", 200);

        Order order = new Order.Builder()
                .addProduct(display, 5)
                .addProduct(chair, 4)
                .addProduct(keyboard, 5)
                .setDiscount(10.0)
                .setPaymentMethod("card")
                .build();

        order.showOrder();


    }
}
