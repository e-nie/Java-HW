package mock_prep.OOPTasks.polymorphism.report_service;

public class PDFReport extends Report{
    public PDFReport(String name) {
        super(name);
    }

    @Override
    public void generateReport() {
        System.out.println("PDF report " +  getName() + "  is generated");
    }
}
