package mock_prep.OOP_tasks_1.polymorphism.reporting_system;

public abstract class Report {
    protected String name;

    public Report(String name) {
        this.name = name;
    }

    public abstract void createReport();
}
