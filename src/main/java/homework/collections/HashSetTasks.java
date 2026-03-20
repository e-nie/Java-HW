package homework.collections;

import java.util.*;

public class HashSetTasks {
    static void main(String[] args) {
        //1
        HashSet<Integer> hashSet = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(hashSet);

        //2
        HashSet<Integer> hashSetNumbers = new HashSet<>();
        hashSetNumbers.add(1);
        hashSetNumbers.add(2);
        hashSetNumbers.add(3);
        hashSetNumbers.add(4);
        hashSetNumbers.add(5);
        hashSetNumbers.add(6);
        hashSetNumbers.add(7);
        hashSetNumbers.add(8);
        hashSetNumbers.add(9);
        hashSetNumbers.add(10);
        System.out.println(hashSetNumbers.contains(7));

        //3
        List<String> newList = Arrays.asList("re", "ver", "op", "re", "po", "op");
        System.out.println(removeDuplicates(newList));

        //4
        HashSet<String> names = new HashSet<>(Arrays.asList("Bettina", "Petra", "Claudia", "Evchen"));
        containsName(names,"Evchen");
    }


    //METHODS

    //1. Создайте HashSet из 5 чисел и выведите его содержимое.
    //2. Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
    //3. Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
    public static Set<String> removeDuplicates(List<String> list) {
        return new HashSet<>(list);
    }

    //4 Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет,
    // содержится ли ваше имя в множестве, и выводит соответствующее сообщение.

    public static void containsName(HashSet<String> set, String name) {
        if(set.contains(name)){
            System.out.println(name + " is in the set");
        } else {
            System.out.println(name + " is not in the set");
        }
    }
}
