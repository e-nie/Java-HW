package homework.collections;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTask {
    static void main(String[] args) {
        //Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(3);
        queue.add(15);
        queue.add(71);
        queue.add(5);

        System.out.println(queue);

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }


}
