package homework.programming_principles.after.task_5;

public class PayPalPayment implements PaymentMethod {
    private final String PAYPAL_MSG = "Оплата через PayPal на сумму ";

    @Override
    public void processPayment(double amount){
        System.out.println(PAYPAL_MSG + amount);
    }
}
