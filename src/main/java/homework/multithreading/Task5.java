package homework.multithreading;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Task5 {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        //5. Реализация пула потоков для обработки задач
        //Условие задачи:
        //Напишите программу, которая использует ExecutorService для создания пула потоков, в котором несколько потоков обрабатывают задачи.
        // Каждая задача — это выполнение простого теста с задержкой. Программа должна создать пул из 4 потоков,
        // каждая задача должна быть выполнена с задержкой в 2 секунды. После выполнения всех задач, результат должен быть выведен в главном потоке.

        ExecutorService executor = Executors.newFixedThreadPool(4);
        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i <= 9; i++) {
            int testNumber = i;

            Future<String> future = executor.submit(() -> {
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    System.out.println("Interrupted");
                }
                return "Test " + testNumber + " completed by" + Thread.currentThread().getName();
            });

            results.add(future);
        }

        for (Future<String> result : results) {
            System.out.println(result.get());
        }

        executor.shutdown();

    }
}
