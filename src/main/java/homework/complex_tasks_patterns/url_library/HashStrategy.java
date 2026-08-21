package homework.complex_tasks_patterns.url_library;

public class HashStrategy implements ShorteningStrategy {
    @Override
    public String shorten(String longUrl) {
        int hash = longUrl.hashCode();
        return Integer.toHexString(hash);
    }
}
