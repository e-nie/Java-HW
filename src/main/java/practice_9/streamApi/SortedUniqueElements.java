package practice_9.streamApi;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortedUniqueElements {
    //список с дублирующимися значениями
    //вывести все значения в отсортированном порядке
    static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(2, 1,2, 3, 3, 4, 2, 5);

        List<Integer> uniqueSorted = numbers.stream()
                .distinct()
                .peek(n-> System.out.println("distinct: " + n))
                .sorted()
                .peek(n-> System.out.println("sorted: " + n))
                .toList();
        System.out.println(uniqueSorted);
    }
}
