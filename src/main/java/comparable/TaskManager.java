package comparable;

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

/**
 * список дел
 * <p>
 * Необходимо охранить список задач, который можно пополнять, удалять, сортировать по сроку выполнения
 * <p>
 * алгоритм решения:
 * 1) выбор структуры данных
 * линейная (список или массив)?
 * какие популярные операции?
 * если часто доступ к элементу и редко изменения размера (вставка, удаление) - МАССИВ
 * если доступ к элементу нужен редко и частые изиенения размера - вставка, удаление - СПИСОК
 * <p>
 * Решение: Список
 * <p>
 * 2) проектирование элемента структуры данных
 * Задача:
 * название
 * срок выполнения: int, Date
 * <p>
 * 3) Как реализовать сортировку?
 *
 */
public class TaskManager {
    private LinkedList<Task> tasks;

    public TaskManager() {
        this.tasks = new LinkedList<>();
    }

    public void addTask(Task task) {
        this.tasks.add(task);
        System.out.println("Log: Task " + task.getName() + " added!");
    }

    public void removeTaskByName(String name) {
        // Step 1: find task
        Task foundTask = null;

        for (Task task : tasks) {
            if (task.getName().equals(name)) {
                foundTask = task;
            }
        }

        //обработали ситуацию, когда задача не найдена по имени
        if (foundTask == null) {
            System.out.println("Error: The task with name " + name + " not found!");
            return;
        }
        // Step 2: Delete task
        this.tasks.remove(foundTask);
        System.out.println("Log: Task with name " + name + " was deleted!");
    }

    public LinkedList<Task> sortByDeadline() {
        //option 1: bubble sorting (i.e. invent a bicycle)
        //option 2: reuse existing sorting from Collections.sort()

        //sorting primitives works by default under the hood
        // (Java knows which primitive type is greater, e.g. 8 > 4 )
        // BUT Java does not know who is greater in Task class, which we created, because it's a reference type
        //we need to explain Java how to compare Task objects

        LinkedList<Task> sortedTasks = new LinkedList<>(tasks);
        Collections.sort(sortedTasks);
        System.out.println("Log: Task list has been sorted by deadline");
        return sortedTasks;


    }

}
