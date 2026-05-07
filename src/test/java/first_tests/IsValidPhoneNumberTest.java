package first_tests;

import homework.first_tests.IsValidPhoneNumber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class IsValidPhoneNumberTest {
    /**
     * Positive case:
     * "+1 1234567890" -> true
     * "+44 9876543210" → true.
     * "+999 1111111111" → true.
     * Negative cases:
     * Некорректные номера:
     * "12345" -> false
     * "invalid" -> false
     * "+1 abcdefghij" → false.
     * "+1234 1234567890" (слишком длинный код страны) → false.
     * "+1 123" (недостаточно цифр) → false.
     * "" (пустая строка) → false.
     * null → Должно выбрасываться IllegalArgumentException.
     */


    protected IsValidPhoneNumber isValidPhoneNumber;

    @BeforeEach
    public void setUp() {
        isValidPhoneNumber = new IsValidPhoneNumber();
    }

    @ParameterizedTest
    @ValueSource(strings = {
            "+1 1234567890",
            "+44 9876543210",
            "+999 1111111111"
    })

    public void shouldReturnTrueforValidPhones(String phone) {
        assertTrue(isValidPhoneNumber.isValidPhoneNumber(phone));
    }


    @ParameterizedTest
    @ValueSource(strings = {
            "12345",
            "invalid",
            "+1 abcdefghij",
            "+1234 1234567890",
            "+1 123",
            ""
    })

    public void shouldReturnFalseforInvalidPhones(String phone) {
        assertFalse(isValidPhoneNumber.isValidPhoneNumber(phone));
    }

    @Test
    public void shouldThrowNullPointerException(){
        assertThrows(NullPointerException.class,
                () -> isValidPhoneNumber.isValidPhoneNumber(null));
    }
}
