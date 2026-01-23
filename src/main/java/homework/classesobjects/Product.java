package homework.classesobjects;

public class Product {
    private String name;
    private double price;

    public Product(String newName, double newPrice) {
        this.name = newName;
        this.price = newPrice;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public double applyDiscount(double discount) {
        price -= discount;
        return price;
    }

    public void printInfo() {
        System.out.println("Name: " + name + ", Price: " + price);
    }

    public static void main(){
        Product newProduct = new Product("Pyjamas", 200);
        newProduct.setPrice(180);
        newProduct.applyDiscount(30);
        newProduct.printInfo();
    }


}
