package mock_prep.OOPTasks.polymorphism.payment_system;

import java.util.List;

public class PaymentSystem {
    public void payAll(List<Payment> payments){
        for(Payment payment:payments){
            payment.pay();
        }

    }
}
