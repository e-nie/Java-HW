package homework.OOP_principles_in_Java.task_8;


/**
 *
 * Условие:
 * В музее выставлен экспонат.
 * У каждого экспоната своя история и условия хранения.
 * Примеры:
 * Манускрипт — требует контролируемой влажности
 * Скульптура — нуждается в реставрации
 * Нужно создать систему, которая управляет экспонатом и предоставляет информацию о нём.
 */
public class Main {
    static void main(String[] args) {
        Museum museum = new Museum();
        Manuscript manuscript = new Manuscript();
        Sculpture sculpture = new Sculpture();
        museum.addExhibit(manuscript);
        museum.addExhibit(sculpture);
        museum.exhibitSummary();
 
    }
}
