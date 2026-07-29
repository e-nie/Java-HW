package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public class PPPay extends PaymentType{
    public PPPay(String owner, double amount) {
        super(owner, amount);
    }

    @Override
    public void pay(){
        System.out.println("PayPal of " + getOwner() + " paid the amount of " + getAmount());
    }
}
