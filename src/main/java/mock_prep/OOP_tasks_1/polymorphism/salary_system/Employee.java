package mock_prep.OOP_tasks_1.polymorphism.salary_system;

public abstract class Employee {
    protected String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract double pay();
}
