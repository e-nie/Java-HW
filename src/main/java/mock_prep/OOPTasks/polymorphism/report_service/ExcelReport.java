package mock_prep.OOPTasks.polymorphism.report_service;

public class ExcelReport extends Report{
    public ExcelReport(String name) {
        super(name);
    }

    @Override
    public void generateReport() {
        System.out.println("Excel report " + getName() + " is generated");
    }
}
