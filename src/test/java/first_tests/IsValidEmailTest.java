package first_tests;

import homework.first_tests.IsValidEmail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsValidEmailTest {
    /**
     * Positive cases -  Корректные email:
     * "test@example.com", "user.name@domain.co", "a@b.cc" → true
     * Negative cases - некорректные email:
     * "bad@.com", "no-at-symbol", "@missing-user.com", "user@domain" → false
     * ("test@example.com", "bad@.com", "no-at-symbol")
     * Edge Cases:
     * Пустая строка: "" → false
     * null: -> false
     */

    protected IsValidEmail isValidEmail;

    @BeforeEach
    public void setUp() {
        isValidEmail = new IsValidEmail();
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "test@example.com",
            "user.name@domain.co",
            "a@b.cc"
    })
    public void isValidEmailPositive(String email) {
        assertTrue(isValidEmail.isValidEmail(email));
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "bad@.com",
            "no-at-symbol",
            "@missing-user.com",
            "user@domain",
            ""
    })

    public void isValidEmailNegative(String email) {
        assertFalse(isValidEmail.isValidEmail(email));
    }

    @Test
    public void isValidEmailNegativeWithNull() {
        assertFalse(isValidEmail.isValidEmail(null));
    }


}
