package mock_prep.OOPTasks.polymorphism.payment_system;

public class PayPalPayment extends Payment{

    public PayPalPayment(String owner){
        super(owner);
    }

    public void pay(){
        System.out.println("PayPal " + getOwner() + " paid 11_000");
    }
}
