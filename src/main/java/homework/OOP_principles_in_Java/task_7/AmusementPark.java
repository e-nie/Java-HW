package homework.OOP_principles_in_Java.task_7;

public class AmusementPark {
    private AttractionMachine attraction;

    public void setAttraction(AttractionMachine machine){
        this.attraction = machine;
        System.out.println("Log: Attraction is set!");
    }

    public void maintainAttraction(){
        this.attraction.maintenance();
        System.out.println("Log: Maintenance done");
    }

    public void showAttractionInfo(){
        this.attraction.showInfo();
        System.out.println("Log: Info printed");
    }
}
