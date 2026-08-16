package mock_prep.OOP_tasks_1.polymorphism.payment_service;

public abstract class Employee {
    private String name;

    public Employee(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double calculateSalary();
}
