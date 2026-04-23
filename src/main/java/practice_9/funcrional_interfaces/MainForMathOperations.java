package practice_9.funcrional_interfaces;

public class MainForMathOperations {
    static void main(String[] args) {
        MathOperations add = (x, y) -> x + y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;


        System.out.println(add.apply(2,3));
        System.out.println(subtract.apply(12,3));
        System.out.println(multiply.apply(8,3));
        System.out.println(divide.apply(12,3));
    }
}
