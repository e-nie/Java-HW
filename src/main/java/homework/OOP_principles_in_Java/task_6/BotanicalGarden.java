package homework.OOP_principles_in_Java.task_6;

public class BotanicalGarden {
     private Plant  plant;

     public void addPlant(Plant plant){
         this.plant = plant;
         System.out.println("Plant added!");
     }

     public void maintainPlant(){
         this.plant.care();
         System.out.println("Plant has been cared of!");
     }
}
