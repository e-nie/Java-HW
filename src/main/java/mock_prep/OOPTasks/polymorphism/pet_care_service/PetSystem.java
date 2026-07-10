package mock_prep.OOPTasks.polymorphism.pet_care_service;

import java.util.List;

public class PetSystem {
    public void allSleep(List<Pet> pets){
        for(Pet pet: pets){
           pet.sleep();
        }
    }

    public void allEat(List<Pet> pets) {
        for(Pet pet : pets) {
            pet.eat();
        }
    }
}
