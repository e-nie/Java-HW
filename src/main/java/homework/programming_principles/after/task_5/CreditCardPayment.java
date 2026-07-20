package homework.programming_principles.after.task_5;

public class CreditCardPayment implements PaymentMethod{
    private final String CREDIT_CARD_MSG = "Оплата кредитной картой на сумму ";

    @Override
    public void processPayment(double amount){
        System.out.println(CREDIT_CARD_MSG + amount);
    }
}
