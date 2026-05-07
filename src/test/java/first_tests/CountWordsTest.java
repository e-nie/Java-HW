package first_tests;

import homework.first_tests.CountWords;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CountWordsTest {
    /**
     * Positive:
     * Обычная строка: "Hello world" → countWords() → 2.
     * Строка с лишними пробелами: " Java is awesome " → countWords() → 3.
     * Пустую строку → countWords() → 0.
     * Строку с несколькими пробелами: "   " → countWords() → 0.
     * null строка: null → Должно выбрасываться NullPointerException.
     */
    protected CountWords countWords;

    @BeforeEach
    public void setUp() {
        countWords = new CountWords();
    }

    public static Stream<Arguments> wordCountPositiveCases() {
        return Stream.of(
                Arguments.of("Hello world", 2),
                Arguments.of(" Java is awesome ", 3),// 🔴BUG -> fixed method
                Arguments.of("", 0),
                Arguments.of("     ", 0));

    }

    @ParameterizedTest
    @MethodSource("wordCountPositiveCases")
    public void shouldCountWordsInValidStrings(String str, int expected) {
        int actual = countWords.countWords(str);

        assertEquals(expected, actual);
    }

    @Test
    public void shouldThrowNullPointerExceptionWithNull() {
        assertThrows(NullPointerException.class,
                () -> countWords.countWords(null));
    }
}
