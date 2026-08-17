package homework.design_patterns.adapter.miles_converter;

public class Main {
    static void main(String[] args) {
        MilesProcessor milesProcessor = new MilesProcessor(100);
        DistanceProcessor adapter = new MileToKilometerAdapter(milesProcessor);
        adapter.processDistance();
    }
}
