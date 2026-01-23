package homework.classesobjects;

public class Laptop {

    private String brand;
    private double price;

    public Laptop(String newBrand, double newPrice) {
        this.brand = newBrand;
        this.price = newPrice;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public void printInfo() {
        System.out.println("Brand: " + brand + ", Price: " + price);
    }

    public static void main(String[] args) {
        Laptop newLaptop = new Laptop("Mac", 4000);
        newLaptop.setPrice(5000);
        newLaptop.printInfo();
    }
}
