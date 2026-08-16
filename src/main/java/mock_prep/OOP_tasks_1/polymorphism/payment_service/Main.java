package mock_prep.OOP_tasks_1.polymorphism.payment_service;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {
        Employee employee1 = new FixedSalaryEmployee("Mary", 5000);
        Employee employee2 = new HourlyRateEmployee("Peter", 150, 27);
        Employee employee3 = new SalesPercentEmployee("Alan", 4555, 0.13);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);

        PaymentService service = new PaymentService();
        service.payAll(employeeList);
    }
}
