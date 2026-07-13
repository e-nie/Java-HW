package mock_prep.OOPTasks.composition_aggregation.shop_cart;

public class Main {
    static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();
        Product product1 = new Product("Handy", 1_000, "1223");
        Product product2 = new Product("Book", 5_000, "4343");
        Product product3 = new Product("Skillet", 4_000, "8788");
        Product product4 = new Product("Table", 2_000, "90890");

        cart.addProduct(product1, 5);
        cart.addProduct(product2, 4);
        cart.addProduct(product3, 3);
        cart.addProduct(product4, 1);

        cart.showItems();

        cart.removeProduct("Table");
        System.out.println();
        cart.showItems();

        System.out.println();
        cart.changeQuantity("Book", 0);
        cart.showItems();

        System.out.println();
        System.out.println("Total: " + cart.calculateTotal());
    }
}
