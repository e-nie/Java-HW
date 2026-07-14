package mock_prep.OOPTasks.composition_aggregation.development_team;

public class TeamMember {
    private Developer developer;
    private String role;
    private double salary;

    public TeamMember(Developer developer, String role, double salary) {
        this.developer = developer;
        this.role = role;
        this.salary = salary;
    }

    public Developer getDeveloper() {
        return developer;
    }

    public String getRole() {
        return role;
    }

    public double getSalary() {
        return salary;
    }

    public void changeSalary(double salary) {
          this.salary = salary;
    }

    public void changeRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        return developer.getName() + " -  " + developer.getMainStack() + " - " + getRole() + " -  " + getSalary();
    }
}
