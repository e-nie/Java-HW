package practice_9.funcrional_interfaces;

public class MainForChecker {
    static void main(String[] args) {
        Checker isPositive = n -> n > 0;
        isPositive.printIfValid(5);
        isPositive.printIfValid(-5);
    }

}
