package mock_prep.OOP_tasks_1.polymorphism.payment_service;

import java.util.ArrayList;
import java.util.List;

public class PaymentService {


    public void payAll(List<Employee> employeeList){
        for(Employee employee: employeeList){
            employee.calculateSalary();
        }
        System.out.println("The Salary has been paid to everyone");
    }
}
