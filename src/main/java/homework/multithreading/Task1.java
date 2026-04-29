package homework.multithreading;

public class Task1 {
    static void main() {
        //1. Задача: создание одного потока
        //Условие задачи: Напишите программу, в которой создается отдельный поток,
        // выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.


        Thread thread = new Thread(() -> {
            for (int i = 0; i < 5; i++) {
                System.out.println("Hello from the Thread!!!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    System.out.println("The Thread was interrupted");
                }
            }
        });

        thread.start();
        thread.interrupt();




    }
}
