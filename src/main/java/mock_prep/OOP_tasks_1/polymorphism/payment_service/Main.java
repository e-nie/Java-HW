package mock_prep.OOP_tasks_1.polymorphism.payment_service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        PaymentType bank = new BankPay("Olly", 1200);
        PaymentType payPal = new PPPay("Molly", 1500);
        PaymentType crypto = new Crypto("Polly", 1600);

        List<PaymentType> payments = new ArrayList<>();
        payments.add(bank);
        payments.add(payPal);
        payments.add(crypto);


        PaymentService service = new PaymentService();

     service.payAll(payments);

    }
}
