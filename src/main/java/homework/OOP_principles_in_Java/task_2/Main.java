package homework.OOP_principles_in_Java.task_2;

/**
 *
 * В системе может быть один домашний питомец, у каждого вида свои особенности ухода.
 * Примеры:
 * Собака гуляет и ест сухой корм
 * Кошка играет и ест влажный корм
 * Нужно спроектировать систему, которая позволяет взаимодействовать с любым питомцем с учётом его особенностей.
 *
 * Abstract class or interface?
 *
 *
 *
 * Entities: Dog, cat, owner(system), pet
 * Actions: goForAWalk, eat, play
 * Properties: Pet - Walk, eat
 * Relationships:
 *Pet - no properties
 * Pet playable - polymorphism
 * Pet walkable - polymorphism
 *
 *Pet types(inheritance):
 * dog - no properties, actions - walk, eat(dry food)
 * cat - no properties, actions - play, eat (wet food)
 *
 *System
 *
 * add pet
 * feed pet
 * play with playable pet
 * walk with walkable pet
 *
 *
 */

public class Main {

    static void main(String[] args) {
        Dog sharik = new Dog();

        PetSystem petSystem = new PetSystem();
        petSystem.addPet(sharik);
        petSystem.feedPet();
        petSystem.feedPet();
        petSystem.makePetWalk();
        petSystem.makePetPlay();

        petSystem.addPet(new Cat());
        petSystem.feedPet();
        petSystem.makePetWalk();
        petSystem.makePetPlay();





    }





}
