package first_tests;

import homework.first_tests.FindSecondMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindSecondMaxTest {
    /**
     * Positive cases:
     * Обычные массивы: [3, 5, 7, 2] → findSecondMax() → 5
     * Negative cases:
     * Массив с одинаковыми числами : [4, 4, 4, 4] →  NoSuchElementException.
     * Один элемент в массиве: [8] →   IllegalArgumentException
     * Empty Array: [] ->  IllegalArgumentException.
     */

    protected FindSecondMax findSecondMax;

    @BeforeEach
    public void setUp() {
        findSecondMax = new FindSecondMax();
    }

    public static Stream<Arguments> arraysToValidatePositiveCases() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 5),
               Arguments.of( new int[]{12, 13, 15, 26, 36},26),
                Arguments.of(new int[]{55, 65, 75, 86, 966}, 86)
        );
    }

    @ParameterizedTest
    @MethodSource("arraysToValidatePositiveCases")
        public void shouldReturnSecondMaxValue(int[] arr, int secondMax) {
        assertEquals(secondMax, findSecondMax.findSecondMax( arr));
    }

    public static Stream<int[]> arraysToValidateExceptions() {
        return Stream.of(
                new int[]{4},
                new int[]{}
        );
    }

    @ParameterizedTest
    @MethodSource("arraysToValidateExceptions")
    public void shouldThrowIllegalArgumentExceptionWithInvalidData(int[] arr) {
        assertThrows(IllegalArgumentException.class,
                () -> findSecondMax.findSecondMax(arr));
    }

    @Test
    public void shouldThrowNoSuchElementExceptionWithInvalidData() {
        assertThrows(NoSuchElementException.class,
                () -> findSecondMax.findSecondMax(new int[]{4, 4, 4, 4}));
    }
}
