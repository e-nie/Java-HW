package homework.programming_principles.after.task_2;


//2. Нарушение KISS (Keep It Simple, Stupid) – чрезмерно сложный код
public class DiscountCalculator {
    private final double LOYAL_CUSTOMER_FIRST_PURCHASE_DISCOUNT = 0.10;
    private final double LOYAL_CUSTOMER_GENERAL_DISCOUNT = 0.05;
    private final double COUPON_DISCOUNT = 0.07;
    private final double MIN_DISCOUNT = 0.02;


    public double calculateDiscount(double price, boolean isLoyalCustomer, boolean isFirstPurchase, boolean hasCoupon) {

        if (isLoyalCustomer && isFirstPurchase) {
            return price - (price * LOYAL_CUSTOMER_FIRST_PURCHASE_DISCOUNT);
        }
        if (isLoyalCustomer) {
            return price - (price * LOYAL_CUSTOMER_GENERAL_DISCOUNT);
        }
        if (hasCoupon) {
            return price - (price * COUPON_DISCOUNT);
        }
        return price - (price * MIN_DISCOUNT);
    }
}
//Задача: Упростите код, убрав вложенные условия, сделав его более читаемым и поддерживаемым.

