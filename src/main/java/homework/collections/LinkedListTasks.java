package homework.collections;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListTasks {
    static void main(String[] args) {
        //1
        LinkedList<String> linkedList = new LinkedList<>(Arrays.asList("Apple", "Banana", "Pumpkin", "Fish", "Honey"));
        printAllElements(linkedList);

        //2
        LinkedList<String> linkedListOfTasks = new LinkedList<>();
        linkedListOfTasks.add("Task1");
        linkedListOfTasks.add("Task2");
        linkedListOfTasks.add("Task3");

        System.out.println(linkedListOfTasks);
        processTasksInOrderOfArrival(linkedListOfTasks);

        //3
        LinkedList<String> linkedListFirstLast = new LinkedList<>(Arrays.asList("first", "second", "third", "fourth", "last"));
        printFirstLast(linkedListFirstLast);

        //4
        LinkedList<Integer> linkedListIntegers = new LinkedList<>(Arrays.asList(5, 8, 9, 7));
        System.out.println(sumOfIntegers(linkedListIntegers));

        //5
        LinkedList<String> linkedListIterator = new LinkedList<>(Arrays.asList("Summer", "Time", "And", "The", "Living", "Is", "Happy"));
        iterateBothDirections(linkedListIterator);

    }

    //METHODS
    //1.Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.

    public static void printAllElements(LinkedList<String> linkedList) {
        System.out.println(linkedList);
    }

    //2.Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.

    public static void processTasksInOrderOfArrival(LinkedList<String> tasks) {
        for (String task : tasks) {
            System.out.println("Log: " + task + " processed");
        }
    }

    //3.Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.

    public static void printFirstLast(LinkedList<String> firstLast) {
        System.out.println("First: " + firstLast.getFirst() + ",  Last: " + firstLast.getLast());
    }

    //4.Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.

    public static Integer sumOfIntegers(LinkedList<Integer> integers) {
        Integer sum = 0;
        for (Integer el : integers) { // для каждого элемента из integers
            sum += el;
        }
        return sum;
    }

    //5.Используйте ListIterator для прохода по LinkedList в обоих направлениях.

    public static void iterateBothDirections(LinkedList<String> poem) {
        ListIterator<String> it = poem.listIterator();

        System.out.println("Forward: ");
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Backward: ");
        while (it.hasPrevious()) {
            System.out.println(it.previous());
        }
    }





}
