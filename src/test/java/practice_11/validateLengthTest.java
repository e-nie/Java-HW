package practice_11;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class validateLengthTest extends StringProcessorTest {
    /**
     *
     * Positive tests:
     * "abba", 3 -> "abba"
     * "abba", 4 -> "abba"
     * <p>
     * Negative cases:
     * "abba", 5 -> IllegalArgumentException
     * <p>
     * corner cases:
     * "abba", 0 -> "abba"
     * "", 0 -> ""
     * "hello", -1 -> IllegalArgumentException
     */


    public static Stream<Arguments> stringForPositiveValidation() {
        return Stream.of(
                Arguments.of("abba", 3), //positive
                Arguments.of("abba", 4), //positive
                Arguments.of("abba", 0), //corner
                Arguments.of("", 0)      //corner
        );
    }

    @ParameterizedTest
    @MethodSource("stringForPositiveValidation")
    public void userCanValidateStringWithLengthMoreOrEqualtoMinValue(String input, int minLength) {
        String actualResult = stringProcessor.validateLength(input, minLength);
        assertEquals(input, actualResult);

    }

    public static Stream<Arguments> stringForNegativeValidation() {
        return Stream.of(
                Arguments.of("abba", 5), //negative
                Arguments.of("hello", -1) //corner  - а вот тут похоже баг, потому что в методе необработано отрицательное значение длины
        );
    }

    @ParameterizedTest
    @MethodSource("stringForNegativeValidation")
    public void userCannotValidateStringWithLengthLessMinValue(String input, int minLength) {
        assertThrows(IllegalArgumentException.class, () -> {
            stringProcessor.validateLength(input, minLength);
        }, "Validation of string with length of less than min value should lead to IllegalArgumentException ");

    }

}
