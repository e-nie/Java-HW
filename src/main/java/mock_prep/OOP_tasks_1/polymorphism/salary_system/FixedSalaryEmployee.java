package mock_prep.OOP_tasks_1.polymorphism.salary_system;

public class FixedSalaryEmployee extends Employee {
    private double fixedSalary;

    public FixedSalaryEmployee (String name, double fixedSalary) {
        super(name);
        this.fixedSalary = fixedSalary;
    }

    public double pay() {
        return fixedSalary;

    }
}
