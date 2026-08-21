package homework.complex_tasks_patterns.url_library;

public class ShortenerFactory {
    private final ShorteningStrategy strategy;

    public ShortenerFactory(ShorteningStrategy strategy) {
        this.strategy = strategy;
    }

    public ShorteningStrategy createStrategy() {
        return strategy;
    }
}
