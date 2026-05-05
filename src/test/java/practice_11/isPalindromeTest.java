package practice_11;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

public class isPalindromeTest extends StringProcessorTest {

    /*
     *   Метод для проверки, является ли строка палиндромом
     *  Happy path/positive cases:
     *  even number of letters:   abba -> true
     *  odd number of letters: kok -> true
     *
     *  negative cases:
     * - evchen -> false
     * corner cases:
     * - "a" -> true
     * - "" -> true
     * - null -> IllegalArgumentException
     */


    @ParameterizedTest
    @ValueSource(strings = {
            //positive cases
            "abba", "kok",
            //corner cases
            "a", ""})

    public void userCanCheckIfValidStringIsPalindrome(String initialString) {
        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertTrue(actualResult);

    }

    @Test
    public void userCanCheckIfValidStringIsNotPalindrom() {
        String initialString = "evchen";

        boolean actualResult = stringProcessor.isPalindrome(initialString);

        assertFalse(actualResult);
    }

    @Test
    public void userCannotCheckIfNullStringIsPalindrome() {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.isPalindrome(null);
        }, "Checking of null string should lead to IllegalArgumentException");
    }
}
