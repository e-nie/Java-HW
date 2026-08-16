package homework.design_patterns.builder.internet_shop;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List<ProductItem> items;
    private double discount;
    private String paymentMethod;

    private Order(Builder builder) {
        this.items = builder.items;
        this.discount = builder.discount;
        this.paymentMethod = builder.paymentMethod;
    }

    public void showOrder(){
        System.out.println("Order: ");
        System.out.println("Items: " + items);
        System.out.println("Discount: " + discount);
        System.out.println("Payment method: " + paymentMethod);
    };

    public static class Builder {
        private List<ProductItem> items = new ArrayList<>();
        private double discount;
        private String paymentMethod;

        Builder addProduct(Product product, int quantity) {
            ProductItem productItem  = new ProductItem(product, quantity);
            items.add(productItem);
            return this;
        }

        public Builder setDiscount(double discount) {
            this.discount = discount;
            return this;
        }

        public Builder setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Order build(){
            return new Order(this);
        }
    }

}
