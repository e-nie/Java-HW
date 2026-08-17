package homework.design_patterns.adapter.miles_converter;

public class MileToKilometerAdapter implements DistanceProcessor {
    private MilesProcessor milesProcessor;

    public MileToKilometerAdapter(MilesProcessor milesProcessor) {
        this.milesProcessor = milesProcessor;
    }

    @Override
    public void processDistance() {
        double miles = milesProcessor.getMiles();
        double kilometres = miles * 1.60934;
        System.out.println(miles + " miles = " + kilometres + " kilometres");
    }
}
