package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public class FixedSalaryEmployee extends Employee{
    private double fixedSalary;

    public FixedSalaryEmployee(String name, double fixedSalary){
        super(name);
        this.fixedSalary = fixedSalary;
    }

    @Override
    public double calculateSalary(){
        return fixedSalary;
    }
}
