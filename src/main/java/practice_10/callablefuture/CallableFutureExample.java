package practice_10.callablefuture;

import java.util.Random;
import java.util.concurrent.*;

public class CallableFutureExample {
    //сложные расчеты ДНК
    //наша задача - дождаться вычисления и получить результат

    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();

        Callable<Integer> dnaResult = () -> {
            System.out.println("Very complicated calculations");
            Thread.sleep(10000);
            return new Random().nextInt();
        };

        Future<Integer> future = executorService.submit(dnaResult);

        System.out.println("DNA result: " + future.get());

        executorService.shutdown();
    }
}
