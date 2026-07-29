package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public class Crypto extends PaymentType{
    public Crypto(String owner, double amount) {
        super(owner, amount);
    }

    @Override
    public void pay(){
        System.out.println("CryptoWallet of " + getOwner() + " sent the amount of " + getAmount());
    }
}
