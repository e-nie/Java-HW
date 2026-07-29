package mock_prep.OOP_tasks_1.polymorphism.reporting_system;

public class PDFreport extends Report{
    public PDFreport(String name){
        super(name);
    }
    @Override
    public void createReport(){
        System.out.println("PDF report on " + name + " has been created");
    }
}
