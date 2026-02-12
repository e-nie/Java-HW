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
        Cow cow = new Cow();
        Farmer farmer = new Farmer();
        farmer.addAnimal(cow);
        farmer.printAnimalInfo();

        Hen hen = new Hen();
        farmer.addAnimal(hen);
        farmer.printAnimalInfo();
    }


}
