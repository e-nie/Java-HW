package mock;

public class PercentEmployee extends Employee {
    private double percent;
    private double sales;

    public PercentEmployee(String name, double percent, double sales) {
        super(name);
        this.percent = percent;
        this.sales = sales;
    }

    @Override
    public double pay() {
        return sales * percent;
    }
}
