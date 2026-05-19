package homework.complex_tasks.task_6;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager<T> {
    private List<Task<T>> tasks = new ArrayList<>();

    public List<Task<T>> getTasks() {
        return tasks;
    }

    public void addTask(Task<T> task) {
        boolean idExists = tasks.stream()
                .anyMatch(existingTask -> existingTask.getId().equals(task.getId()));

        if (idExists) {
            return;
        }
        tasks.add(task);
    }

    public Task<T> findTaskById(T id){
        return tasks.stream()
                .filter(task -> task.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public synchronized void deleteTaskById(T id) {
        tasks.removeIf(task -> task.getId().equals(id));
    }

    public List<Task<T>> filterTasksByStatus(String status) {
        return tasks.stream()
                .filter(task -> task.getStatus().equals(status))
                .collect(Collectors.toList());
    }

    public List<Task<T>> filterTasksByPriority(int priority) {
        return tasks.stream()
                .filter(task -> task.getPriority() == (priority))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortTasksByDateAsc(){
        return tasks.stream()
                .sorted((t1,t2)-> t1.getDate().compareTo(t2.getDate()))
                .collect(Collectors.toList());
    }

    public List<Task<T>> sortTasksByDateDesc(){
        return tasks.stream()
                .sorted((t1,t2)-> t2.getDate().compareTo(t1.getDate()))
                .collect(Collectors.toList());
    }
}
