package mock_prep.OOP_tasks_1.polymorphism.payment_service;

import java.util.List;

public class PaymentService {
    public void payAll(List<PaymentType> payments){
        for(PaymentType type: payments){
            type.pay();
        }
    }
}
