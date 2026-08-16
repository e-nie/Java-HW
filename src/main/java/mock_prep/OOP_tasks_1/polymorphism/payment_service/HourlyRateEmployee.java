package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public class HourlyRateEmployee extends Employee{
    private double rate;
    private int hoursWorked;

    public HourlyRateEmployee(String name, int hoursWorked, double rate){
        super(name);
        this.hoursWorked = hoursWorked;
        this.rate = rate;
    }

    @Override
    public double calculateSalary(){
        return rate * hoursWorked;
    }
}
