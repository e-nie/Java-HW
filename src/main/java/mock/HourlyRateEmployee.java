package mock;

public class HourlyRateEmployee extends Employee {
    private double hourlyRate;
    private int hours;

    public HourlyRateEmployee(String name, double hourlyRate, int hours) {
        super(name);
        this.hourlyRate = hourlyRate;
        this.hours = hours;
    }

    @Override
    public double pay() {
        return hours * hourlyRate;
    }
}
