package homework.multithreading;

public class Task3 {
    private static volatile boolean stop = false;

    static void main(String[] args) {
        //3. Задача: использование volatile
        //Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
        // В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.

        Thread thread = new Thread(() -> {
            int counter = 0;
            while (!stop) {
                counter++;
            }
            System.out.println("Counter after stop: " + counter);
        });

        thread.start();

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            System.out.println("Main interrupted");
        }

        stop = true;
        System.out.println("Main stopped the counter incrementation");

    }
}
