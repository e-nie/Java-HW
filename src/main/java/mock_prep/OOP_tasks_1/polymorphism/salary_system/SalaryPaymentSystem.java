package mock_prep.OOP_tasks_1.polymorphism.salary_system;

import java.util.ArrayList;
import java.util.List;

public class SalaryPaymentSystem {

    public void sendPaymentAllStaff(List<Employee> employees) {
        for (Employee employee : employees) {
            System.out.println("Employee " + employee.getName() + " received " + employee.pay());
            employee.pay();
        }
    }
}
