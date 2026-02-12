package homework.OOP_principles_in_Java.task_4;

/**
 * 4. Аквариум
 * В аквариуме находится одно морское существо, которое может быть разного типа.
 * У каждого существа уникальное поведение и способ передвижения.
 * Примеры:
 * Акула плавает быстро и агрессивно
 * Морская звезда ползает медленно по дну
 * Нужно создать систему, которая позволяет добавить существо в аквариум и демонстрировать его поведение.
 * <p>
 * <p>
 * Entities: Aquarium, seaCreature(starfish, shark)
 * Actions, properties, relationships:
 * Sea creature - no properties, can move
 * <p>
 * <p>
 * Sea creature subtypes: (inheritance):
 * Starfish - no properties, actions - crawls along the bottom
 * Shark - no properties, swims fast and aggressive
 * Aquarium - has a property - a sea creature,
 * has an action - add a new sea creature and make it to demonstrate its' behaviour
 *
 *
 */

public class Main {
    static void main(String[] args) {
        Starfish newStarfish = new Starfish();
        AquariumManager aquarium = new AquariumManager();
        aquarium.addSeaCreature(newStarfish);
        aquarium.showBehaviour();

        Shark newShark = new Shark();
        aquarium.addSeaCreature(newShark);
        aquarium.showBehaviour();
    }
}

