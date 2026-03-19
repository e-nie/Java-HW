package homework.collections;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetTasks {
    static void main() {
        //1
        TreeSet<Integer> treeSet = new TreeSet<>(Arrays.asList(1, 2, 568, 4, 5, 0, 8));
        System.out.println(treeSet);
        //2
        addElementsWithoutDuplicates(treeSet, 5);
        addElementsWithoutDuplicates(treeSet, 0);
        addElementsWithoutDuplicates(treeSet, 77);
        System.out.println(treeSet);

        //3
        findClosestNumbers(treeSet, 4);
    }


    //METHODS
    //1. Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
    //2. Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
    public static void addElementsWithoutDuplicates(Set<Integer> set, int el) {
        set.add(el);
    }

    //3. Найдите ближайшее большее и меньшее число к заданному в TreeSet.
    public static void findClosestNumbers(TreeSet<Integer> set, int number) {
        Integer lower = set.lower(number);
        Integer higher = set.higher(number);
        System.out.println("Lower number: " + lower);
        System.out.println("Higher number: " + higher);
    }
}
