package mock_prep.OOPTasks.polymorphism.report_service;

import java.util.List;

public class ReportService {
    public void generateAllReports(List<Report> reports) {
        for(Report report : reports) {
            report.generateReport();
        }
    }
}
