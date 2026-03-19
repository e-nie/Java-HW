package homework.collections;

import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class TreeMapTasks {
    static void main(String[] args) {


        //1
        TreeMap<String, Integer> treeMap = new TreeMap<>(Map.of(
                "Snow", 100,
                "White", 90,
                "Red", 75,
                "Silverstone", 99,
                "Black", 81
        ));

        System.out.println(treeMap);

        //2
        System.out.println(treeMap.firstKey());//min
        System.out.println(treeMap.lastKey()); // max

        //3
        TreeMap<Integer, String> employee = new TreeMap<>(Map.of(
                10, "Employee1",
                23, "Employee2",
                17, "Employee3",
                3, "Employee4",
                98, "Employee5",
                61, "Employee6",
                27, "Employee7",
                85, "Employee8",
                90, "Employee9",
                123, "Employee10"
        ));
        findClosestID(employee, 17);
    }


    //METHODS

    //1. Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
    //2. Найдите минимальный и максимальный ключ в TreeMap.
    //3. Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
    public static void findClosestID(TreeMap<Integer, String> map, int number) {
        Integer lower = map.lowerKey(number);
        Integer higher = map.higherKey(number);
        System.out.println("Lower number: " + lower);
        System.out.println("Higher number: " + higher);
    }

}
