package homework.OOP_principles_in_Java.task_5;

public class Farmer {
    private FarmAnimal farmAnimal;

    public void addAnimal(FarmAnimal farmAnimal) {
        this.farmAnimal = farmAnimal;

    }

    public void printAnimalInfo(){
        this.farmAnimal.produce();
        this.farmAnimal.feed();
        this.farmAnimal.care();
    }
}
