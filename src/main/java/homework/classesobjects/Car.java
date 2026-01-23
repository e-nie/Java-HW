package homework.classesobjects;

public class Car {
    private String brand;
    private int year;

    public Car(String newBrand, int newYear) {
        this.brand = newBrand;
        this.year = newYear;
    }

    public String getBrand() {
        return brand;
    }

    public int getYear() {
        return year;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public void setYear(int newYear) {
        this.year = newYear;
    }

    public void print() {
        System.out.println("Brand: " + brand + ", Made: " + year);
    }


    public static void main(String[] args) {
        Car newCar = new Car("Audi", 2020);
        newCar.setYear(2025);
        newCar.print();
    }
}
