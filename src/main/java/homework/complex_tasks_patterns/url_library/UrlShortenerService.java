package homework.complex_tasks_patterns.url_library;

public class UrlShortenerService {
    private final ShortenerFactory factory;
    private final UrlStorage storage;

    public UrlShortenerService(ShortenerFactory factory, UrlStorage storage) {
        this.factory = factory;
        this.storage = storage;
    }

    public String shortenUrl(String longUrl) {
        ShorteningStrategy strategy = factory.createStrategy();// fabric returns chosen strategy

        String shortUrl = strategy.shorten(longUrl);// strategy creates short key
        storage.save(shortUrl, longUrl); // storage saves a pair key(shortUrl) : value(longUrl)
        return shortUrl; // key returns to user
    }

    public String expandUrl(String shortUrl) {
        return storage.findLongUrl(shortUrl);
    }
}
