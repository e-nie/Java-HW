package homework.collections;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    static void main(String[] args) {

        //1
        Map<String, Integer> person = new HashMap<>();
        person.put("Nick", 69);
        person.put("Sharon", 15);
        person.put("Sara", 26);
        person.put("Leo", 30);
        person.put("Nina", 8);
        System.out.println(person);

        //2
        containsName(person, "Sara");
        containsName(person, "Peter");

        //3
        printAllUsersUnderAge(person, 18);

    }


    //METHODS
    //1.Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
    //2. Проверьте, есть ли определённое имя в HashMap.
    public static void containsName(Map<String, Integer> map, String name) {
        if (map.containsKey(name)) {
            System.out.println("The name " + name + " is present in the list");
        } else {
            System.out.println("The name " + name + " is not in the list");
        }
    }

    //3. Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
    public static void printAllUsersUnderAge(Map<String, Integer> map, int age) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() < age) {
                System.out.println(entry.getKey());
            }
        }
    }
}
