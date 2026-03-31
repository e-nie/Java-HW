package homework.exceptions_and_generics.exceptions;
//3. Создание и использование собственного проверяемого исключения


public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }

    static void main(String[] args) {
        try {
            checkAge(152);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage() );
        }
    }

    static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException("Invalid age value!");
        } else {
            System.out.println("Age is correct");
        }
    }
}
