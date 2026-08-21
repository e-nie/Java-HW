package homework.complex_tasks_patterns.url_library;

import java.util.UUID;

public class UUIDStrategy implements ShorteningStrategy {
    @Override
    public String shorten(String longUrl) {

        return UUID.randomUUID()
                .toString()
                .replace("-", "")
                .substring(0, 10);

    }
}
