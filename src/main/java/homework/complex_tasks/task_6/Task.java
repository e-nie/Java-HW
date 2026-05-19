package homework.complex_tasks.task_6;

import java.time.LocalDate;

public class Task<T> {
    private T id;
    private String status;
    private int priority;
    private LocalDate date;

    public Task(T id, String status, int priority, LocalDate date) {
        this.id = id;
        this.status = status;
        this.priority = priority;
        this.date = date;
    }

    public T getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public int getPriority() {
        return priority;
    }

    public LocalDate getDate() {
        return date;
    }
}
