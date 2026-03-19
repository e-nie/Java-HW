package homework.collections;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTasks {
    static void main() {

        //1
        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("S");
        linkedHashSet.add("P");
        linkedHashSet.add("Q");
        linkedHashSet.add("R");
        System.out.println(linkedHashSet);

        //2.

        addElementsWithoutDuplicates(linkedHashSet, "A");
        addElementsWithoutDuplicates(linkedHashSet, "S");
        addElementsWithoutDuplicates(linkedHashSet, "R");
        System.out.println(linkedHashSet);
    }


    //METHODS
    //1. Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
    //2. Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
    public static void addElementsWithoutDuplicates(Set<String> set, String el) {
        set.add(el);
    }




}
