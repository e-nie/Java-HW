package homework.staticfinalmodificators;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;// why do we need this variable??

    static double calculateCircleArea(double r) {
        return PI * r * r;
    }

    static double calculateCircumference(double r) {
        return 2 * PI * r;
    }

     static void main(String[] args) {
        System.out.println("Circle Area with radius of 5: " + calculateCircleArea(5));
        System.out.println("Circle Area with radius of 10: " + calculateCircleArea(10));
        System.out.println("Circle Circumference with radius of 12: " + calculateCircumference(12));
        System.out.println("Circle Circumference with radius of 6: " + calculateCircumference(6));
    }
}
