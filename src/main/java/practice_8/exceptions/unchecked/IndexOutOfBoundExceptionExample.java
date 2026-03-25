package practice_8.exceptions.unchecked;

public class IndexOutOfBoundExceptionExample {
    static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[5];//попытка доступа к несуществующему индексу
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Attempt to access an index out of bounds of an array");
        }
    }
}
