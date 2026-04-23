package practice_9.funcrional_interfaces;

@FunctionalInterface
public interface Checker {
    //проверяет, удовлетворяет ли число условию
    //Метод по уиолчанию печатает число, если оно проходит проверку

    boolean check(int number);

    default void printIfValid(int number) {
        if (check(number)) {
            System.out.println(number);
        }
    }
}
