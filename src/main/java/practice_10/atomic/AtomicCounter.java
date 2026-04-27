package practice_10.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    //считает количество операций по всем потокам
    private static final AtomicInteger count = new AtomicInteger(0);

    static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Number of operations: " + count);

    }

}
