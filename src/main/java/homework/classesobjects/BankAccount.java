package homework.classesobjects;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String newOwner, int newBalance) {
        this.owner = newOwner;
        this.balance = newBalance;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public void setOwner(String newOwner) {
        this.owner = newOwner;
    }

    public int deposit(int amount) {
        balance += amount;
        return balance;
    }

    public int withdraw(int amount) {
        balance -= amount;
        return balance;
    }

    public void printBalance() {
        System.out.println("Owner:" + owner + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount newBankAccount = new BankAccount("Sophie Wright", 20000);
        newBankAccount.deposit(5000);
        newBankAccount.withdraw(12000);
        newBankAccount.printBalance();
    }
}
