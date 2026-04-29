package homework.multithreading;

public class Task2 {
    //2. Задача: создание двух потоков
    //Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B",
    // каждый по 5 раз с небольшой задержкой.

    static void main(String[] args) {
        Thread threadA = new Thread(()-> {
            for(int i = 0; i < 5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("ThreadA interrupted");
                }
            }
        });


        Thread threadB = new Thread(()-> {
            for(int i = 0; i < 5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    System.out.println("ThreadB interrupted");
                }
            }
        });

        threadA.start();
        threadB.start();

    }




}
