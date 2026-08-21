package homework.complex_tasks_patterns.url_library;

public interface UrlStorage {
    void save(String shortUrl, String longUrl);

    String findLongUrl(String shortUrl);
}
