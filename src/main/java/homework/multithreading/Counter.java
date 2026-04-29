package homework.multithreading;

public class Counter {
    private int count;

    public synchronized void increment() {
        count++;
    }

    public int getCount() {
        return count;
    }

    static void main(String[] args) throws InterruptedException {
        //4. Задача: использование synchronized
        //Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика. Создайте два потока,
        // каждый из которых вызывает increment() 1000 раз. Обеспечьте правильную работу с помощью synchronized.


        Counter counter = new Counter();
        Thread t1 = new Thread(()-> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread t2 = new Thread(()-> {
            for(int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count: " + counter.getCount());
    }
}
