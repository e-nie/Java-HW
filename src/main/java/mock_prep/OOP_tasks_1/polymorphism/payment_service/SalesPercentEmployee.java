package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public class SalesPercentEmployee extends Employee{
    private double salesAmount;
    private double percent;

    public SalesPercentEmployee(String name, double salesAmount, double percent){
        super(name);
        this.salesAmount = salesAmount;
        this.percent = percent;
    }

    @Override
    public double calculateSalary(){
        return salesAmount * percent;
    }
}
