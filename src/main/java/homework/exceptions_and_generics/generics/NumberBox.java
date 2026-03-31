package homework.exceptions_and_generics.generics;

import java.util.ArrayList;
import java.util.List;

public class NumberBox<T extends Number> {

    private List<T> numbers = new ArrayList<>();


    public void add(T number) {
        numbers.add(number);
    }

    public double sum() {
        double sum = 0;

        for (T el : numbers) {
            sum += el.doubleValue();
        }
        return sum;
    }
}
