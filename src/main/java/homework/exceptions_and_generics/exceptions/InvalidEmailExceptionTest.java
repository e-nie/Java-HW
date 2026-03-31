package homework.exceptions_and_generics.exceptions;

public class InvalidEmailExceptionTest {
    static void main(String[] args) {
        try {
            InvalidEmailException.validateEmail("fjkdjfkd@fdfdf.");

        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }

    }
}
