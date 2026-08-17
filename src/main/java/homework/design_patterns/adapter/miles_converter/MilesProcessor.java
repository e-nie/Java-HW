package homework.design_patterns.adapter.miles_converter;

public class MilesProcessor {
    private double miles;


    public MilesProcessor(double miles) {
        this.miles = miles;
    }

    public double getMiles() {
        return miles;
    }
}
