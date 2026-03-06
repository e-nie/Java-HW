package comparable;

import java.util.Date;

public class Task implements Comparable<Task>{
    private String name;
    private Date date;

    public Task(String name, Date date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }

    /**
     * возвращаем негативное число, если задача task более приоритетная,
     * то есть дедлайн раньше, чем у текущей задачи this
     * возврашаем ноль, если задача task такого же приоритета, то есть дедлайн равен this
     * возвращаем позитивное число, если задача task менее приоритетная, то есть дедлайн позже,
     * чем у текущей задачи this
     *
     * @param task the object to be compared.
     * @return
     */
    @Override
    public int compareTo(Task task) {
        return this.date.compareTo(task.date);
    }
}
