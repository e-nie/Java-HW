package mock;

public class FixedRateEmployee extends Employee {
    private double fixedRate;

    public FixedRateEmployee(String name, double fixedRate) {
        super(name);
        this.fixedRate = fixedRate;

    }

    @Override
    public double pay() {
        return fixedRate;
    }
}
