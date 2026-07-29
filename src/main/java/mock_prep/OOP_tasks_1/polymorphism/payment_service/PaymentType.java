package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public abstract class PaymentType {
    private String owner;
    private double amount;

    public PaymentType(String owner, double amount) {
        this.owner = owner;
        this.amount = amount;
    }

    public String getOwner() {
        return owner;
    }

    public double getAmount() {
        return amount;
    }

    public abstract void pay();
}
