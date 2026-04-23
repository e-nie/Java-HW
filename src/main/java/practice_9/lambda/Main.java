package practice_9.lambda;

public class Main {
    static void main(String[] args) {
        Runnable r1 = new Runnable() {
            //анонимный класс
            @Override
            public void run() {
                System.out.println("Hello World");
            }
        };
        r1.run();

        Runnable r2 = () -> System.out.println("Hello World");
        r2.run();
    }
}
