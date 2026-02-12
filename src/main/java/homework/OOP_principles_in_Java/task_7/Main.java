package homework.OOP_principles_in_Java.task_7;

/**
 * Условие:
 * В парке есть аттракцион, каждый из которых предлагает свои ощущения и требует обслуживания.
 * Примеры:
 * Американские горки — проверка безопасности
 * Карусель — техническое обслуживание
 * Нужно создать систему, которая управляет аттракционом и выводит информацию для посетителей.
 */
public class Main {
    static void main(String[] args) {

        Carousel carousel = new Carousel();
        AmusementPark park = new AmusementPark();
        park.setAttraction(carousel);
        park.maintainAttraction();
        park.showAttractionInfo();

        RollerCoaster rollercoaster = new RollerCoaster();
        park.setAttraction(rollercoaster);
        park.maintainAttraction();
        park.showAttractionInfo();
    }
}