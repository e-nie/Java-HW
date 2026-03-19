package homework.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapTasks {
    static void main(String[] args) {
        //1

        Map<Integer, String> calendar = new LinkedHashMap<>();
        calendar.put(0, "January");
        calendar.put(1, "February");
        calendar.put(2, "March");
        calendar.put(3, "April");
        calendar.put(4, "May");
        System.out.println(calendar);

        //2
        Map<String, Integer> phoneBook = new LinkedHashMap<>();
        phoneBook.put("Jacob Jacobson", 789978);
        phoneBook.put("Connor Jason", 552123);
        phoneBook.put("Joseph Later", 654554);
        phoneBook.put("Christian Lotte", 4556533);
        phoneBook.put("Frederick Paulsen", 76578584);

        findContact(phoneBook, "Connor Jason");

        //3 ❗️If we have 1 user - key : view number, value: what was viewed
        Map<Integer, String> history = new LinkedHashMap<>(Map.of(
                1, "Page 1",
                2, "Page 2",
                3, "Page 3",
                4, "Page 4",
                5, "Page 5",
                6, "Page 6",
                7, "Page 7",
                8, "Page 8"
        ));

        addView(history, 9, "Page 9");
        System.out.println(history);
        addView(history, 10, "Page 10");
        addView(history, 11, "Page 11");
        addView(history, 12, "Page 12");
        System.out.println(history);
    }


    //METHODS

    //1. Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
    //2. Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.

    public static void findContact(Map<String, Integer> map, String name) {
        if (map.containsKey(name)) {
            System.out.println(map.get(name));
        } else {
            System.out.println("Contact is not found");
        }
    }

    //3. Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).

    public static void addView(Map<Integer, String> history, int key, String value) {
        if (history.size() >= 10) {
            Integer firstKey = history.keySet().iterator().next();
            history.remove(firstKey);
        }
        history.put(key, value);
    }


}