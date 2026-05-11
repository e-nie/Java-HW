package first_tests;

import homework.first_tests.IsLeapYear;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class IsLeapYearTest {
    protected IsLeapYear isLeapYear;

    /**
     * positive cases:
     * Високосные (2020, 2000, 1600) -> true
     * * Edge positive cases:
     * 4, 400 → true
     * Negative cases:
     * Обычные годы 2019, 2021, 2022 → false
     * Года, которые делятся на 100, но не на 400 (1900, 2100) -> false
     */
    @BeforeEach
    public void setUp() {
        isLeapYear = new IsLeapYear();
    }

    @ParameterizedTest
    @ValueSource(ints = {
            //positive cases - leap years
            2020, 2000, 1600,
            //positive corner cases
            4, 400})

    public void setIsLeapYearValidYears(int year) {

        assertTrue(isLeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @ValueSource(ints = {
            //negative cases - non-leap years
            2019, 2021, 2022,
            //negative corner cases - Года, которые делятся на 100, но не на 400
            1900, 2100})

    public void setIsLeapYearInValidYears(int year) {
        assertFalse(isLeapYear.isLeapYear(year));
    }


}
