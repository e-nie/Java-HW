package homework.functional_interfaces_lambdas;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    static void main(String[] args) {
        MathOperation addition = (a, b) -> a + b;
        MathOperation subtraction = (a, b) -> a - b;
        MathOperation multiplication = (a, b) -> a * b;
        MathOperation division = (a, b) -> a / b;

        System.out.println(addition.apply(5, 6));
        System.out.println(subtraction.apply(8, 6));
        System.out.println(multiplication.apply(15, 6));
        System.out.println(division.apply(13, 4));

        //2. Использование анонимного класса
        //Задача: Создайте анонимный класс, реализующий интерфейс Runnable,
        // который выводит сообщение "Hello from anonymous class!".
        Runnable r = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };
        r.run();

        //3. Лямбда-выражение с Predicate
        //Задача: Напишите лямбду, которая проверяет, является ли число чётным.
        Predicate<Integer> isEven = n -> n % 2 == 0;
        System.out.println(isEven.test(89));
        System.out.println(isEven.test(84));

        //4. Лямбда-выражение с Function
        //Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
        Function<String, Integer> getLength = s -> s.length();
        System.out.println(getLength.apply("Simple"));

        //5. Использование Consumer
        //Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
        Consumer<String> str = s -> System.out.println(s);
        str.accept("I accept only");


        //STREAM API
        //1. Фильтрация строк по длине больше 5
        //Задача: Напишите программу, которая принимает список строк
        // и удаляет из него все строки длиной 5 символов и менее, используя Stream API.
        List<String> list = List.of("fdfd", "trtrt", "weweopop", "pfkkf", "fgdhjghf", "iorei");
        List<String> result = list.stream()
                .filter(s -> s.length() > 5)
                .collect(Collectors.toList());
        System.out.println(result);

        //2. Фильтрация чисел, кратных 5
        //Задача: Напишите программу, которая принимает список чисел
        // и отбирает только те, которые делятся на 5 без остатка, используя Stream API.

        List<Integer> integerList = List.of(56, 3, 5, 2, 1, 0, -7, 45);
        List<Integer> res = integerList.stream()
                .filter(n -> n % 5 == 0 && n != 0)
                .collect(Collectors.toList());
        System.out.println(res);

        //3. Преобразование строк в их длины
        //Задача: Напишите программу, которая принимает список строк
        // и заменяет каждую строку на её длину, используя Stream API.
        List<String> listOfStrings = List.of("lala", "o-oo-oo!", "muuuuuu-uuuuuuu-u", "hop-hei-lalalay", "oleg");
        List<Integer> lengths = listOfStrings.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());
        System.out.println(lengths);

        //4. Создание списка квадратов чисел
        //Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
        // где каждое число заменено на его квадрат, используя Stream API.
        List<Integer> listOfInts = List.of(3, 5, 2, 8, 4);
        List<Integer> squares = listOfInts.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());
        System.out.println(squares);

        //5. Удаление дубликатов из списка
        //Задача: Напишите программу, которая принимает список элементов
        // и удаляет из него все дубликаты, используя Stream API.
        List<Integer> duplicatedList = List.of(4, 9, 9, 9, 34, 0, 3, 7, 3, 1, 2, 8, 4, 4, 0);
        List<Integer> uniqueList = duplicatedList.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(uniqueList);


        //Часть 3: Stream API – агрегирующие операции
        //1. Поиск максимального элемента
        //Задача: Напишите программу, которая принимает список чисел
        // и находит в нём самое большое число, используя Stream API.
        List<Integer> findMax = List.of(4, 9, 9, 9, 34, 0, 3, 7, 3, 1, 2, 8, 4, 4, 0);
        Integer maX = findMax.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(maX);

        //2. Поиск минимального элемента
        //Задача: Напишите программу, которая принимает список чисел
        // и находит в нем наименьшее число, используя Stream API.
        List<Integer> findMin = List.of(4, 9, 9, -9, 34, 0, 3, 7, 3, 1, 2, 8, 4, 4, 0);
        Integer miN = findMin.stream()
                .min(Comparator.naturalOrder())
                .get();
        System.out.println(miN);

        //3. Сумма всех элементов списка
        //Задача: Напишите программу, которая принимает список чисел
        // и вычисляет их сумму, используя Stream API.
        List<Integer> findSum = List.of(4, 9, 9, -9, 34, 0, 3, 7, 3, 1, 2, 8, 4, 4, 0);
        Integer suM = findSum.stream()
                .mapToInt(n -> n)
                .sum();
        System.out.println(suM);

        //4. Поиск первого элемента, начинающегося на "Б"
        //Задача: Напишите программу, которая принимает список строк
        // и находит первую строку, начинающуюся на букву "Б", используя Stream API.
        List<String> listOfB = List.of("lala", "o-oo-oo!", "muuuuuu-uuuuuuu-u", "bi-bi", "Blala", "hop-hei-lalalay", "oleg", "ooooo");
        String bWord = listOfB.stream()
                .filter(w -> w.startsWith("B"))
                .findFirst()
                .orElse("not found");
        System.out.println(bWord);

        //5. Проверка наличия хотя бы одного элемента по условию
        //Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
        // который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
        List<Integer> ifAny = List.of(4, 9, 9, -9, 34, 0, 3, 7, 3, 1, 2, 8, 4, 4, 0);
        boolean lessThanZero = ifAny.stream()
                .anyMatch(n -> n < 0);
        System.out.println(lessThanZero);

        //Часть 4: Stream API – группировка и редукция
        //1. Группировка строк по первой букве
        //Задача: Напишите программу, которая принимает список строк
        // и группирует их по первой букве, используя Stream API.
        List<String> ungrouped = List.of("lala", "o-oo-oo!", "muuuuuu-uuuuuuu-u", "bi-bi", "Blala", "hop-hei-lalalay", "oleg", "ooooo");
        Map<Character, List<String>> grouped = ungrouped.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));
        System.out.println(grouped);

        //2. Группировка чисел по чётности
        //Задача: Напишите программу, которая принимает список чисел
        // и группирует их на чётные и нечётные, используя Stream API.
        List<Integer> evenUngrouped = List.of(4, 9, 9, -9, 34, 0, 3, 7, 3, 1, 2, 8, 4, 4, 0);
        Map<Boolean, List<Integer>> evenGrouped = evenUngrouped.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));
        System.out.println(evenGrouped);

        //3. Поиск среднего значения чисел
        //Задача: Напишите программу, которая принимает список чисел
        // и находит их среднее значение, используя Stream API.

        List<Integer> listOfAvg = List.of(4, 9, 9, -9, 34, 0, 3, 7, 3, 1, 2, 8, 4, 4, 0);
        double avg = listOfAvg.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(avg);


    }

}