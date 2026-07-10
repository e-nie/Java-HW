package mock_prep.OOPTasks.polymorphism.payment_system;

public class BankPayment extends Payment{

    public BankPayment(String owner){
        super(owner);
    }

    public void pay(){
        System.out.println("Card " + getOwner() + " paid 10_000");
    }
}
