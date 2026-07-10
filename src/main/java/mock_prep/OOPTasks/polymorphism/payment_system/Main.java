package mock_prep.OOPTasks.polymorphism.payment_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Payment bank = new BankPayment("Alex");
        Payment payPal = new PayPalPayment("Evchen");
        Payment crypto = new CryptoWallet("Mozes");

        List<Payment> payments = new ArrayList<>();
        payments.add(bank);
        payments.add(payPal);
        payments.add(crypto);

        PaymentSystem system = new PaymentSystem();
        system.payAll(payments);








    }
}
