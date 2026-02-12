package homework.OOP_principles_in_Java.task_6;

/**
 * В ботаническом саду содержится одно растение.
 * У разных видов растений разные требования по уходу.
 * Примеры:
 * Орхидея нуждается в тени и высокой влажности
 * Кактус требует много света и редкого полива
 * Нужно создать систему, которая добавляет растение в сад и обеспечивает необходимый уход.
 *
 *
 *
 */
public class Main {
    static void main(String[] args) {
        Orchid orchid = new Orchid();
        BotanicalGarden garden = new BotanicalGarden();
        garden.addPlant(orchid);
        garden.maintainPlant();

        Cactus cactus = new Cactus();
        garden.addPlant(cactus);
        garden.maintainPlant();
    }
}


