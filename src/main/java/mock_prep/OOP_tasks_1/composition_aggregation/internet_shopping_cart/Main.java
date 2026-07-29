package mock_prep.OOP_tasks_1.composition_aggregation.internet_shopping_cart;

public class Main {
    static void main(String[] args) {
        Product product1 = new Product("Table", 200, "squ-009");//600
        Product product2 = new Product("Lamp", 800, "squ-003");//4000
        Product product3 = new Product("Chair", 600, "squ-089");//deleted
        Product product4 = new Product("Mirror", 300, "squ-569");//1500


        Cart cart = new Cart();
        cart.addProduct(product1, 5);
        cart.addProduct(product2, 5);
        cart.addProduct(product3, 5);
        cart.addProduct(product4, 5);

        cart.showItems();
        System.out.println();

        cart.changeQuantity("Table", 3);
        cart.showItems();
        System.out.println();

        cart.removeProduct("Chair");
        cart.showItems();
        System.out.println();

        System.out.println("Total: " + cart.calculateTotal());


    }
}
