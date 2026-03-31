package homework.exceptions_and_generics.exceptions;
//4. Создание и использование собственного непроверяемого исключения
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InvalidEmailException extends RuntimeException {
    public InvalidEmailException(String message) {
        super(message);
    }


    public static void validateEmail(String email) {
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(email);
        if (!matcher.matches()) {
            throw new InvalidEmailException("Invalid email: " + email);
        }
    }
}
