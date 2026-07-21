package homework.OOP_principles_in_Java.task_5;


/**
 *
 * Условие:
 * На ферме содержится одно домашнее животное.
 * У каждого животного свои функции и нужды.
 * Примеры:
 * Корова даёт молоко, нуждается в выпасе
 * Курица несёт яйца, требует зерно
 * Нужно создать систему, которая позволяет управлять животным с учётом его потребностей.
 */
public class Main {
    static void main(String[] args) {

        Farmer farmer = new Farmer();
        Cow cow = new Cow();
        Hen hen = new Hen();

        farmer.addAnimal(cow);
        farmer.addAnimal(hen);

        farmer.printAnimalInfo();

    }


}
