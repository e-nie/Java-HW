package first_tests;

import homework.first_tests.FindMax;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.NoSuchElementException;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FindMaxTest {
    protected FindMax findMax;

    @BeforeEach
    public void setUp() {
        findMax = new FindMax();
    }

    /**
     * positive cases:
     * Обычный массив ([3, 5, 7, 2])
     * Один элемент в массиве [1] -> 1// edge positive
     * Отрицательные числа [-3, -5, -7, -2] → -2 //edge positive
     * //negative cases:
     * Пустой массив (должно выбрасываться исключение) -> NoSuchElementException
     * null -> IllegalArgumentException
     */


    public static Stream<Arguments> provideArraysForFindMax() {
        return Stream.of(
                Arguments.of(new int[]{3, 5, 7, 2}, 7),
                Arguments.of(new int[]{7}, 7),
                Arguments.of(new int[]{-3, -5, -7, 2}, 2)
        );
    }

    @ParameterizedTest
    @MethodSource("provideArraysForFindMax")

    public void findMaxShouldReturnMaxValue(int[] numbers, int expected) {
        int actualResult = findMax.findMax(numbers);

        assertEquals(expected, actualResult);
    }

    @Test
    public void shouldThrowExceptionIfArrayIsEmpty() {
        NoSuchElementException exception = assertThrows(NoSuchElementException.class,
                () -> findMax.findMax(new int[]{}));
        assertEquals("No value present", exception.getMessage());
    }

    @Test
    public void shouldThrowExceptionIfArrayHasNull() {
        NullPointerException exception = assertThrows(NullPointerException.class,
                () -> findMax.findMax(null));
        assertEquals("Cannot read the array length because \"array\" is null", exception.getMessage());
    }
}
