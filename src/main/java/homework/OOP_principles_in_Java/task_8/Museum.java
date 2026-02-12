package homework.OOP_principles_in_Java.task_8;

public class Museum {
    private Exhibit exhibit;

    public void setExhibit(Exhibit exhibit){
        this.exhibit = exhibit;
    }

    public void exhibitSummary(){
        this.exhibit.preserveMethod();
        this.exhibit.showExhibitInfo();
    }
}
