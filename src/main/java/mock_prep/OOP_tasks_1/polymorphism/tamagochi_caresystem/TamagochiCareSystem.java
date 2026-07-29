package mock_prep.OOP_tasks_1.polymorphism.tamagochi_caresystem;

import java.util.List;

public class TamagochiCareSystem {

    public void feedAll(List<Pet> petsList){
        for(Pet pet: petsList){
            pet.eat();
        }
    }

    public void putAllToSleep(List<Pet> petsList){
        for(Pet pet : petsList){
            pet.sleep();
        }
    }
}
