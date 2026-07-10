package mock_prep.OOPTasks.polymorphism.student_system;

/**
 * Student Grade Journal
 *
 * Реализовать систему журнала оценок студентов.
 *
 * В журнале хранятся студенты по имени.
 * У каждого студента есть список его оценок.
 *
 * Необходимо реализовать:
 *
 * 1. Добавление оценки студенту.
 * 2. Получение всех оценок студента.
 * 3. Расчёт среднего балла студента.
 * 4. Проверку существования студента в журнале.
 * 5. Получение количества студентов в журнале.
 *
 * Правила:
 *
 * * Если студента ещё нет в журнале, он создаётся при добавлении первой оценки.
 * * У одного студента может быть несколько оценок.
 * * Средний балл рассчитывается только по оценкам этого студента.
 *
 * Пример:
 *
 * addGrade("Anna", 5);
 * addGrade("Anna", 4);
 * addGrade("Boris", 3);
 *
 * Оценки:
 *
 * Anna -> [5, 4]
 * Boris -> [3]
 *
 * Средний балл:
 *
 * Anna -> 4.5
 * Boris -> 3.0
 */
public class Main {
    static void main(String[] args) {

        GradeJournal journal = new GradeJournal();

        journal.addGrade("Anna", 5);
        journal.addGrade("Anna", 4);
        journal.addGrade("Boris", 3);
        journal.addGrade("Boris", 2);

        System.out.println(journal.getGrades("Anna"));
        System.out.println(journal.getGrades("Boris"));

        System.out.println(journal.getAverageGrade("Anna"));
        System.out.println(journal.getAverageGrade("Boris"));
    }
}
