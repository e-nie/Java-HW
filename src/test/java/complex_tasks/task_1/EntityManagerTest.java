package complex_tasks.task_1;

import homework.complex_tasks.task_1.Entity;
import homework.complex_tasks.task_1.EntityManager;
import homework.complex_tasks.task_1.Student;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class EntityManagerTest {
    /**
     * Добавление элементов:
     * - добавить 1 элемент в пустой менеджер
     * - добавить 1 элемент в НЕпустой менеджер
     * - добавить 1 элемент несколькими потоками (проверка интеграции)
     *
     *
     *
     */

    @Test
    public void addEntityTest() {
        EntityManager<Student> manager = new EntityManager<>();
        Student expectedStudent = new Student("Kolya", 17, true);
        manager.add(expectedStudent);
        // add element:


        // expectation: element is in the final list
        assertTrue(manager.getAll().contains(expectedStudent));


        // expectation: added element == element we have added
        Student actualStudent = manager.getAll().getFirst();

        //compare as objects:
        assertEquals(expectedStudent, actualStudent);

        //compare by fields:
        assertEquals(expectedStudent.getAge(), actualStudent.getAge());
        assertEquals(expectedStudent.getName(), actualStudent.getName());
        assertEquals(expectedStudent.isActive(), actualStudent.isActive());


        // expectation: 1 element has been added (check length!!!)
        int actualStudentSize = manager.getAll().size();
        assertEquals(1, actualStudentSize);


    }


}
