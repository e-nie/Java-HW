package mock_prep.OOPTasks.polymorphism.report_service;

public class HTMLReport extends Report{
    public HTMLReport(String name) {
        super(name);
    }

    @Override
    public void generateReport() {
        System.out.println("HTML report " + getName() + " is generated");
    }
}
