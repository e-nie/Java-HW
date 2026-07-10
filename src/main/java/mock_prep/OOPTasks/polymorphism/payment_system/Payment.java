package mock_prep.OOPTasks.polymorphism.payment_system;

public abstract class Payment {
    private String owner;

    public Payment(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return owner;
    }

    public abstract void pay();
}
