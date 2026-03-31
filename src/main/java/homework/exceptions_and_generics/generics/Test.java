package homework.exceptions_and_generics.generics;

import java.util.List;

public class Test {
    static void main(String[] args) {
        Box<String> box1 = new Box<>();
        box1.setItem("Item1");
        String strValue = box1.getItem();
        System.out.println(strValue);

        Box<Integer> box2 = new Box<>();
        box2.setItem(123);
        Integer intValue = box2.getItem();
        System.out.println(intValue);


        //2. Задача на дженерик метод
        //Условие задачи: Напишите дженерик метод printArray,
        // который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
        Integer[] numbers = {1, 2, 3, 4};
        String[] strings = {"Forest", "Sea", "Mountains"};
        printArray(strings);
        printArray(numbers);

        //3. Задача на дженерик с двумя типами данных
        //Условие задачи: Создайте класс Pair, который может хранить два объекта разных типов.
        // Класс должен позволять получать и устанавливать каждый из этих объектов.

        Pair <String, Integer> pair = new Pair<>();
        pair.setFirst("Price");
        pair.setSecond(500);
        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());

        //Дополнительные задачи (по желанию):
        //
        //Обобщённый класс
        //Задача: Создайте класс Storage<T>, который хранит элемент и возвращает его.
        Storage <String> storage = new Storage<>();
        storage.setItem("Storage");
        System.out.println( storage.getItem());

        List<String> words = List.of("words", "sentences", "metaphors");
        List<Integer> integers = List.of(5,6,2,35);
        printList(words);
        printArray(numbers);

        //Работа с числами
        NumberBox<Integer> box = new NumberBox<>();
        box.add(5);
        box.add(25);
        box.add(20);
        box.add(55);
        System.out.println(box.sum());


        List<Integer> list = List.of(6,7,8);
        sum(list);

    }

    public static <T> void printArray(T[] array) {
        for (T el : array) {
            System.out.println(el);
        }
    }


     //Обобщённый метод
    //Задача: Реализуйте метод printList(List<T>), который принимает список любого типа и выводит его элементы.

    public static <T> void printList(List<T> list) {
        for ( T el: list) {
            System.out.println(el);
        }
    }


    //
    //Ограничение сверху
    //Задача: Напишите обобщённый метод, который принимает List<T extends Number> и вычисляет сумму элементов.

    public static void sum(List<? extends Number> list) {
        double sum = 0;
        for(Number el: list) {
            sum+= el.doubleValue();
        }
        System.out.println(sum);
    }



}
