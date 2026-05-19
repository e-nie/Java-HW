package homework.complex_tasks.task_4;

public class Rating <T extends Number>{
    private T value;

    public Rating(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}
