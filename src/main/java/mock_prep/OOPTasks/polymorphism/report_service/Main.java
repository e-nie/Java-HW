package mock_prep.OOPTasks.polymorphism.report_service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {


        Report pdf = new PDFReport("July Sales");
        Report excel = new ExcelReport("July Salaries");
        Report html = new HTMLReport("Website Statistics");

        List<Report> reports = new ArrayList<>();
        reports.add(pdf);
        reports.add(excel);
        reports.add(html);

        ReportService service = new ReportService();
        service.generateAllReports(reports);
    }
}
