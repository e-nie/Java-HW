package mock_prep.OOP_tasks_1.polymorphism.reporting_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        Report pdf = new PDFreport("Sales for March");
        Report excel = new EXCELreport("Salaries");
        Report html = new HTMLreport("Website stats");

        List<Report> reports = new ArrayList<>();

        reports.add(pdf);
        reports.add(excel);
        reports.add(html);

        ReportingSystem system = new ReportingSystem();

        system.createAllReports(reports);


    }
}
