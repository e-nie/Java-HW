package homework.programming_principles.after.task_5;

public class BitcoinPayment implements PaymentMethod {
    private final String BITCOIN_MSG = "Оплата Bitcoin на сумму ";

    @Override
    public void processPayment(double amount){
        System.out.println(BITCOIN_MSG + amount);
    }
}
