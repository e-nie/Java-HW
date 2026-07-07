package mock;

import java.util.List;

public class SalaryService {
    public void payAll(List<Employee> employees) {
        for(Employee employee: employees) {
            System.out.println(employee.name + " received " + employee.pay());
        }
    }
}
