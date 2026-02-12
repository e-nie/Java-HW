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
        Manuscript manuscript = new Manuscript();
        Museum museum  = new Museum();
        museum.setExhibit(manuscript);
        museum.exhibitSummary();

        Sculpture sculpture  = new Sculpture();
        museum.setExhibit(sculpture);
        museum.exhibitSummary();
    }
}
