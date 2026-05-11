package first_tests;

import homework.first_tests.StringReverse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringReverseTest {
    /**
     * happy path:
     * "hello" → "olleh"
     * "Java" → "avaJ"
     * edge cases:
     * "" → ""
     * "a" → "a"
     * "12345" → "54321"
     * edge case:
     * * null → null
     */
    protected StringReverse stringReverse;


    @BeforeEach
    public void setUp() {
        stringReverse = new StringReverse();
    }


    public static Stream<Arguments> validStringsToReverse() {
        return Stream.of(
                Arguments.of("hello", "olleh"),
                Arguments.of("Java", "avaJ"),
                Arguments.of("", ""),
                Arguments.of("a", "a"),
                Arguments.of("12345", "54321")


        );
    }


    @ParameterizedTest
    @MethodSource("validStringsToReverse")


    public void reverseValidString(String input, String expected) {
        String actualReversedString = stringReverse.reverse(input);
        assertEquals(expected, actualReversedString);

    }

    @Test
    public void reverseStringWithNullInput() {
        String actualResult = stringReverse.reverse(null);
        String expected = null;

        assertEquals(expected, actualResult);
    }


}