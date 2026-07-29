package mock_prep.OOP_tasks_1.polymorphism.reporting_system;

public class HTMLreport extends Report{
    public HTMLreport(String name){
        super(name);
    }
    @Override
    public void createReport(){
        System.out.println("HTML report on " + name + " has been created");
    }
}
