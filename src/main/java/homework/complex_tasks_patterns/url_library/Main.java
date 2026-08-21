package homework.complex_tasks_patterns.url_library;

public class Main {
    static void main(String[] args) {
        ShorteningStrategy strategy = new Base62Strategy();
        ShortenerFactory factory = new ShortenerFactory(strategy);
        UrlStorage storage  = InMemoryStorage.getInstance();
        UrlShortenerService service = new UrlShortenerService(factory,storage);

        String shortUrl = service.shortenUrl("https://veryverylong/unbelievalylong/omg/url");
        System.out.println("Short URL: " + shortUrl);

        String longUrl = service.expandUrl(shortUrl);
        System.out.println("Original URL: " + longUrl);

        System.out.println();

        UrlShortenerService  hashService = new UrlShortenerService(new ShortenerFactory(new HashStrategy()), storage);
        hashService.shortenUrl(longUrl);
        System.out.println("Short URL: " + shortUrl);
        hashService.expandUrl(shortUrl);
        System.out.println("Original URL: " + longUrl);
        System.out.println();

        UrlShortenerService uuidService = new UrlShortenerService(new ShortenerFactory(new UUIDStrategy()), storage);
        uuidService.shortenUrl(longUrl);
        System.out.println("Short URL: " + shortUrl);
        uuidService.expandUrl(shortUrl);
        System.out.println("Original URL: " + longUrl);
    }
}
