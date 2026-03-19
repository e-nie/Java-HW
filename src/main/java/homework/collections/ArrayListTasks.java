package homework.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListTasks {
    static void main(String[] args) {
        //1.create an arraylist with 5 elements and add 1 more
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(1, 2, 3, 8, 456, 4, 5, -2));
        arrayList.add(6);
//        System.out.println(arrayList);

        //2.remove all even numbers
        ArrayList<Integer> listOddsOnly = new ArrayList<>();
        //for
        //forEach
        //while (iterator)

//        Iterator<Integer> iteratorForList = arrayList.iterator();

        //every iterator has hasNext() and next() methods
        //hasNext - true/false
        //next - return next element
        //алгоритм: проверить, есть ли сл элемент, если да  - вернуть его

//        while (iteratorForList.hasNext()) {
//            Integer currentEl = iteratorForList.next();
////            if(currentEl % 2 == 1) {
////                listOddsOnly.add(currentEl);
////                we want to delete
//            if (currentEl % 2 == 0) {
////                arrayList.remove(currentEl);//WRONG!
//                iteratorForList.remove();// CORRECT
//            }
//
//        }
//        System.out.println(listOddsOnly);
//        System.out.println(arrayList);

        ArrayList<String> strings = new ArrayList<>(Arrays.asList("a", "ab", "avava"));

//        System.out.println(findStringWithMaxLength(strings));
//        System.out.println(findSumOfAllElements(arrayList));

        System.out.println(findMaxNumber(arrayList));
    }

    //3. Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
    public static String findStringWithMaxLength(ArrayList<String> strings) {
        Integer max = 0;
        String maxString = "";
        for (String str : strings) {
            if (str.length() > max) {
                max = str.length();
                maxString = str;
            }
        }
        return maxString;
    }

    //4.Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
    public static Integer findSumOfAllElements(ArrayList<Integer> arrayList) {
        Integer sum = 0;
        for (Integer el : arrayList) {
            sum += el;
        }
        return sum;
    }

    //5. Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.

    public static Integer findMaxNumber(ArrayList<Integer> arrayList) {
        if(arrayList.isEmpty()) return null;
        Integer max = 0;
        for (Integer el : arrayList) {
            if (el > max) {
                max = el;
            }
        }
        return max;
    }

}
