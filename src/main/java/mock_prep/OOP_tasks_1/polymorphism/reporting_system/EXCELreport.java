package mock_prep.OOP_tasks_1.polymorphism.reporting_system;

public class EXCELreport extends Report{
    public EXCELreport(String name){
        super(name);
    }
    @Override
    public void createReport(){
        System.out.println("Excel report on " + name + " has been created");
    }
}
