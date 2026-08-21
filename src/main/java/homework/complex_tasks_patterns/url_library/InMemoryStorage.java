package homework.complex_tasks_patterns.url_library;

import java.util.HashMap;
import java.util.Map;

public class InMemoryStorage implements UrlStorage {
    private static final InMemoryStorage INSTANCE = new InMemoryStorage();
    private final Map<String, String> urls = new HashMap<>();

    private InMemoryStorage() {};

    public void save(String shortUrl, String longUrl) {
        urls.put(shortUrl, longUrl);
    }

    public static InMemoryStorage getInstance(){
        return  INSTANCE;
    }

    @Override
    public String findLongUrl(String shortUrl) {
        return urls.get(shortUrl);
    }

}
