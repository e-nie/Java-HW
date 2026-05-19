package complex_tasks.task_6;

import homework.complex_tasks.task_6.Task;
import homework.complex_tasks.task_6.TaskManager;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class TaskManagerTest {
    /**
     * addTask:
     * positive - add,
     * negative - should not add duplicates
     * findTaskById:
     * positive
     * negative(task does not exist)
     * deleteTaskById:
     * positive
     * filterTaskByStatus
     * filterTaskByPriority
     * sortTasksByDateAsc
     * sortTasksByDateDesc
     *
     */
    private TaskManager<Integer> manager;

    @BeforeEach
    void setUp() {
        manager = new TaskManager<>();
    }

    @Test
    void shouldAddTask() {
        Task<Integer> task = new Task<>(1, "new", 1, LocalDate.now());
        manager.addTask(task);

        assertEquals(1, manager.getTasks().size());
        assertEquals(task, manager.getTasks().getFirst());
    }

    @Test
    void shouldFindTaskById() {
        Task<Integer> task1 = new Task<>(1, "new", 1, LocalDate.now());
        Task<Integer> task2 = new Task<>(2, "done", 5, LocalDate.now());
        manager.addTask(task1);
        manager.addTask(task2);

        Task<Integer> actual = manager.findTaskById(2);
        assertEquals(task2, actual);
    }

    @Test
    void shouldDeleteTaskById() {
        Task<Integer> task1 = new Task<>(7, "new", 1, LocalDate.now());
        Task<Integer> task2 = new Task<>(8, "new", 1, LocalDate.now());
        manager.addTask(task1);
        manager.addTask(task2);

        manager.deleteTaskById(8);

        assertEquals(1, manager.getTasks().size());
        assertEquals(task1, manager.getTasks().getFirst());
    }

    @Test
    void shouldFilterTasksByStatus() {
        Task<Integer> task1 = new Task<>(1, "new", 1, LocalDate.now());
        Task<Integer> task2 = new Task<>(2, "done", 5, LocalDate.now());
        Task<Integer> task3 = new Task<>(3, "done", 5, LocalDate.now());

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        List<Task<Integer>> actual = manager.filterTasksByStatus("done");

        assertEquals(2, actual.size());

        assertEquals(task2, actual.getFirst());
        assertEquals(task3, actual.get(1));
    }

    @Test
    void shouldFilterTasksByPriority() {
        Task<Integer> task1 = new Task<>(1, "new", 1, LocalDate.now());
        Task<Integer> task2 = new Task<>(2, "done", 5, LocalDate.now());
        Task<Integer> task3 = new Task<>(3, "done", 5, LocalDate.now());

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        List<Task<Integer>> actual = manager.filterTasksByPriority(5);

        assertEquals(2, actual.size());

        assertEquals(task2, actual.getFirst());
        assertEquals(task3, actual.get(1));
    }

    @Test
    void shouldSortTasksByDateASC() {
        Task<Integer> task1 = new Task<>(1, "new", 1, LocalDate.of(2026, 8, 10));
        Task<Integer> task2 = new Task<>(2, "done", 5, LocalDate.of(2026, 6, 3));
        Task<Integer> task3 = new Task<>(3, "done", 5, LocalDate.of(2027, 2, 8));

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        List<Task<Integer>> actual = manager.sortTasksByDateAsc();

        assertEquals(task2, actual.getFirst());
        assertEquals(task1, actual.get(1));
        assertEquals(task3, actual.get(2));
    }

    @Test
    void shouldSortTasksByDateDESC() {
        Task<Integer> task1 = new Task<>(1, "new", 1, LocalDate.of(2026, 8, 10));
        Task<Integer> task2 = new Task<>(2, "done", 5, LocalDate.of(2026, 6, 3));
        Task<Integer> task3 = new Task<>(3, "done", 5, LocalDate.of(2027, 2, 8));

        manager.addTask(task1);
        manager.addTask(task2);
        manager.addTask(task3);

        List<Task<Integer>> actual = manager.sortTasksByDateDesc();

        assertEquals(task3, actual.getFirst());
        assertEquals(task1, actual.get(1));
        assertEquals(task2, actual.get(2));
    }

    @Test
    void shouldReturnNullWhenTaskDoesNotExist() {
        Task<Integer> task = new Task<>(1, "new", 1, LocalDate.now());
        manager.addTask(task);

        Task<Integer> actual = manager.findTaskById(333);
        assertNull(actual);
    }

    @Test
    void shouldNotAddTaskWithDuplicateId() {
        Task<Integer> task1 = new Task<>(1, "new", 1, LocalDate.now());
        Task<Integer> task2 = new Task<>(1, "done", 5, LocalDate.now());
        manager.addTask(task1);
        manager.addTask(task2);

        assertEquals(1, manager.getTasks().size());
        assertEquals(task1, manager.getTasks().getFirst());
    }
}
