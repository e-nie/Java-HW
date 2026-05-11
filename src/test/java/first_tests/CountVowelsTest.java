package first_tests;

import homework.first_tests.CountVowels;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * Разные строки ("hello", "java", "AEIOU", "")
 * null (должно выбрасываться исключение) - IllegalArgumentException
 * Строки без гласных -> 0
 */
public class CountVowelsTest {
    protected CountVowels countVowels;

    @BeforeEach
    public void setUp() {
        countVowels = new CountVowels();
    }

    public static Stream<Arguments> stringForPositiveValidation() {
        return Stream.of(
                Arguments.of("hello", 2), //positive
                Arguments.of("java", 2),// positive
                Arguments.of("AEIOU", 5), // corner positive
                Arguments.of("", 0) // positive, count = 0
        );
    }

    @ParameterizedTest
    @MethodSource("stringForPositiveValidation")
    public void countVowelsInValidStrings(String input, int expected) {
        int actual = countVowels.countVowels(input);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowExceptionWithNullInput() {

        assertThrows(IllegalArgumentException.class,
                ()-> countVowels.countVowels(null));
    }
}
