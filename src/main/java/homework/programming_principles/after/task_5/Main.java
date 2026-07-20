package homework.programming_principles.after.task_5;

public class Main {
    static void main(String[] args) {


        PaymentProcessor processor = new PaymentProcessor();

        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentMethod payPalPayment = new PayPalPayment();
        PaymentMethod bitcoinPayment = new BitcoinPayment();

        processor.processPayment(creditCardPayment, 1000);
        processor.processPayment(payPalPayment, 400);
        processor.processPayment(bitcoinPayment,500);


    }
}
