package homework.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class ArrayDequeTasks {
    static void main(String[] args) {

        //1
        Deque<String> arrayDeque = new ArrayDeque<>();
        arrayDeque.add("A");
        arrayDeque.add("B");
        arrayDeque.add("C");
        arrayDeque.add("D");
        arrayDeque.add("E");
        System.out.println(arrayDeque);

        for (String s : arrayDeque) {
            System.out.println(s);
        }

        //2
        while(! arrayDeque.isEmpty()) {
            System.out.println(arrayDeque.removeLast());
        }
        //3
        Deque<String> deque = new ArrayDeque<>();
        deque.addFirst("C");
        deque.addLast("A");//CA // queue
        deque.addLast("B");//CAB
        deque.addLast("D");//CABD


        System.out.println(deque);
        System.out.println(deque.pollFirst());//C
        System.out.println(deque.pollLast());//D


    }


    //1. Создайте ArrayDeque, добавьте 5 элементов и выведите их.
    //2. Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
    //3. Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.


}
