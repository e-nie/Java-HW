package homework.classesobjects;

public class Circle {
    private double radius;

    public Circle(double newRadius) {
        this.radius = newRadius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference(){
        return 2 * Math.PI * radius;
    }

    public static void main(){
        Circle newCircle = new Circle(25);
        newCircle.setRadius(12);
        System.out.println("Area: " + newCircle.calculateArea());
        System.out.println("Circumference: " + newCircle.calculateCircumference());
    }
}
