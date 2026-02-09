package livecoding_strategy;

import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Order {
    private List<Product> products;
    private List<Discountable> discounts;

    public Order() {
        this.products = new LinkedList<>();
        this.discounts = new LinkedList<>();
    }

    public void addProduct(Product product) {
        this.products.add(product);
    }

    public void addProducts(List<Product> products) {
        this.products.addAll(products);
    }


    public void addDiscount(Discountable discountable) {
        discounts.add(discountable);
    }

    public void addProducts(Discountable discountable) {
        this.discounts.addAll(discounts);
    }

    public double calculateTotalPrice() {

        double totalProductSum = products.stream().mapToInt(Product::getPrice).sum();
        for (Discountable discount : discounts) {
            totalProductSum = totalProductSum - discount.discount(totalProductSum);
        }
        return totalProductSum;
    }
}
