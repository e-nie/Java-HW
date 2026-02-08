package practice_5.task_1;

public class Plane extends Transport {
    public Plane() {
        super(900, 100_000);
    }

    @Override
    void start() {
        System.out.println("The plane took off");
    }
}
