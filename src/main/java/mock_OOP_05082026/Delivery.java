package mock_OOP_05082026;

public abstract class Delivery {
    private String address;

    public Delivery(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public abstract void deliver();

}
