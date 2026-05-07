package first_tests;

import homework.first_tests.Factorial;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialTest {
    /**
     * Positive:
     * Обычные числа: factorial(1) → 1, factorial(5) → 120, factorial(7) → 5040
     * Edge case positive:  0! = 1
     * Negative cases:
     * Отрицательные числа (должно выбрасываться исключение):
     * factorial(-3) → Должно выбрасывать IllegalArgumentException
     */
    protected Factorial factorial;

    @BeforeEach
    public void setUp() {
        factorial = new Factorial();
    }

    @ParameterizedTest
    @CsvSource({
            "1,1",
            "2,2",
            "3,6",
            "4,24",
            "5, 120",
            "7, 5040",
            "9, 362880"
    })

    public void factorialPositive(int n, int expected) {
       int actual =  factorial.factorial(n);
        assertEquals(expected, actual);
    }

    @Test
    public void factorialWithNegativeValue() {
           assertThrows(IllegalArgumentException.class, () -> {
           factorial.factorial(-3);
        });
    }

}
