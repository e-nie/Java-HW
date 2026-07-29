package mock_prep.OOP_tasks_1.polymorphism.reporting_system;

import java.util.List;

public class ReportingSystem {

    public void createAllReports(List<Report> reports) {
        for (Report report : reports) {
            report.createReport();
        }
    }
}
