package homework.first_tests;

import java.util.Arrays;

public class FindMax {
    public int findMax(int[] numbers) {
        return Arrays.stream(numbers).max().orElseThrow();
    }

}
