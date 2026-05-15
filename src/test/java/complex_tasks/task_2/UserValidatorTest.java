package complex_tasks.task_2;

import homework.complex_tasks.task_2.InvalidUserException;
import homework.complex_tasks.task_2.User;
import homework.complex_tasks.task_2.UserValidator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class UserValidatorTest {
    /**
     * Test Cases:
     * Positive:
     * "Eve", 19, "eweww@yahoo.com"
     * "Eve", 18, "eweww@yahoo.com"
     * Name negative:
     * "eve", 20, "eweww@yahoo.com" -> InvalidUserException
     * "" -> InvalidUserException
     * Age negative:
     * "Eve", 10, "eweww@yahoo.com" -> InvalidUserException
     * "Eve", 102," eweww@yahoo.com" -> InvalidUserException
     * Email negative:
     * "Eve", 102, "eweww@yahoo.c" -> InvalidUserException
     *
     *
     */
    private UserValidator validator;

    @BeforeEach
    public void setUp() {
        validator = new UserValidator();

    }

    @ParameterizedTest
    @MethodSource("validUsers")
    public void validatePositiveUser(User user) {
        assertDoesNotThrow(() -> {
            validator.checkName(user);
            validator.checkAge(user);
            validator.checkEmail(user);
        });
    }
    static Stream<User> validUsers() {
        return Stream.of(
                new User("Eve", 19, "eweww@yahoo.com"),
                new User("Eve", 18, "eweww@yahoo.com")

        );
    }

    @ParameterizedTest
    @MethodSource("invalidNames")
    public void shouldThrowExceptionWithInvalidNames(String name) {
        User user = new User(name, 20, "eweww@yahoo.com");

        InvalidUserException exception = assertThrows(InvalidUserException.class, () ->
                validator.checkName(user));
    }
    static Stream<String> invalidNames() {
        return Stream.of("eve",
                "",
                null
        );
    }

    @ParameterizedTest
    @MethodSource("invalidUsers")
    public void shouldThrowExceptionWithInvalidAge(User user) {
        InvalidUserException exception = assertThrows(InvalidUserException.class, () ->
                validator.checkAge(user));
        assertEquals("Age must  be between 18 and 100", exception.getMessage());
    }

    static Stream<User> invalidUsers() {
        return Stream.of(
                new User("Eve", 10, "eweww@yahoo.com"),
                new User("Eve", 102, "eweww@yahoo.com")

        );
    }

    @Test
    public void shouldThrowExceptionWithInvalidEmail() {
        User user = new User("Eve", 20, "eweww@yahoo.c");

        InvalidUserException exception = assertThrows(InvalidUserException.class, () ->
                validator.checkEmail(user));
        assertEquals("Invalid Email!", exception.getMessage());
    }

}
