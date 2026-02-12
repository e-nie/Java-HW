package homework.OOP_principles_in_Java.task_1;


/**
 *
 * Условие:
 * В зоопарке есть одно животное, но оно может быть разным: птица или слон.
 * Каждое животное издаёт уникальные звуки и передвигается по-своему.
 * Например, слон трубит и ходит, а птица чирикает и летает.
 * Нужно спроектировать систему, которая может работать с любым животным, добавлять его в зоопарк и демонстрировать его поведение.
 * *
 * Entities: Zoo; animals: elephant, bird
 * Actions: makeSound (bird: chirp, elephant: trumpet), move(bird: fly,elephant:  walk)
 * Relationships:Abstract class or interface?
 * <p>
 * Animal {
 * makeSound()
 * canMove()
 * }
 * Bird extends Animal (we can have here both inheritance and polymorphism)
 * тут можно реализовать и с интерфейсом, и с абстрактным классом, но на собесе надо выбрать что проще и быстрее - и это через абстр класс
 * <p>
 * Classes and fields; actions:
 * <p>
 * Class: Animal, no fields
 * Action: makeSound, canMove
 * <p>
 * Class: Elephant, no fields
 * Class: Bird, no fields
 * <p>
 * Class Zoo: Animal
 * Action: addAnimal(animal), make animal to produce a sound, make animal to make a move, remove animal
 * animal.makesound, animal.makeMove, animal.remove
 *
 *
 */
public class Main {

    static void main(String[] args) {
        Zoo zoo = new Zoo();

        //add bird to the zoo
        Bird bird = new Bird();
        zoo.addAnimal(bird);
        zoo.sayMakeSound();
        zoo.sayMakeMove();
        zoo.removeAnimal();

        //replace bird to elephant

        Elephant elephant = new Elephant();
        zoo.addAnimal(elephant);
        zoo.sayMakeSound();
        zoo.sayMakeMove();
        zoo.removeAnimal();

    }
}
