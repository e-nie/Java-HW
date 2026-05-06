package first_tests;

import homework.first_tests.IsEven;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsEvenTest {
    protected IsEven isEven;

    @BeforeEach
    public void setUp() {
        isEven = new IsEven();
    }

    /**
     * Тесты должны проверять:
     * Чётные и нечётные числа
     * Positive cases: 10
     * Negative cases: 5
     * Edge cases:
     * Нулевое значение -> 0
     * Отрицательные числа -4 -> -2
     */

    @Test
    public void numberIsEven() {
        assertTrue(isEven.isEven(10));//positive
    }

    @Test
    public void numberIsNotEven() {
        assertFalse(isEven.isEven(5));//negative
    }
    @Test
    public void numberIsNotEvenNegative() {
        assertFalse(isEven.isEven(-5));//negative
    }

    @Test
    public void numberIsEvenZero() {
        assertTrue(isEven.isEven(0));//positive edge case
    }

    @Test
    public void numberIsEvenNegative() {
        assertTrue(isEven.isEven(-8));//positive edge case
    }

}
