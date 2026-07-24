package mock_prep.OOP_tasks_1.polymorphism.salary_system;

public class PercentSalaryEmployee extends Employee{
    private double percent;
    private double salesAmount;

    public PercentSalaryEmployee(String name, double percent, double getSalesAmount ){
        super(name);
        this.percent = percent;
        this.salesAmount = getSalesAmount;
    }

    public double pay(){
        return salesAmount * percent;
    }
}
