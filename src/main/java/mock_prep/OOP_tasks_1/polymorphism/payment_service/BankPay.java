package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public class BankPay extends PaymentType{
    public BankPay(String owner, double amount) {
        super(owner, amount);
    }

    @Override
    public void pay( ){
        System.out.println("Card of " + getOwner() + " paid the amount of " + getAmount());
    }
}
