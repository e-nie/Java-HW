package mock_prep.OOPTasks.polymorphism.payment_system;

public class CryptoWallet extends Payment{

    public CryptoWallet(String owner){
        super(owner);
    }

    public void pay(){
        System.out.println("Crypto wallet " + getOwner() + " sent 12_000");
    }
}
