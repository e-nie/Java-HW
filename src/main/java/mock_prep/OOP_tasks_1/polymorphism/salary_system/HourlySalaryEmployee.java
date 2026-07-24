package mock_prep.OOP_tasks_1.polymorphism.salary_system;

public class HourlySalaryEmployee extends Employee {
    private int hours;
    private double rate;

    public HourlySalaryEmployee(String name, int hours, double rate){
        super(name);
        this.hours = hours;
        this.rate = rate;
    }

    public double pay(){
        return hours * rate;
    }
}
