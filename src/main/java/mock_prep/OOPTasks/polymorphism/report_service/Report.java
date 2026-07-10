package mock_prep.OOPTasks.polymorphism.report_service;

public abstract class Report {
    private String name;

    public Report(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract void generateReport();
}
