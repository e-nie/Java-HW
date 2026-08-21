package homework.complex_tasks_patterns.url_library;

public class Base62Strategy implements ShorteningStrategy {
    private static final String ALPHABET = "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";

    private String convertToBase62(long number) {
        if (number == 0) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        while (number > 0) {
            long remainder = number % 62;
            result.append(ALPHABET.charAt((int) remainder));
            number = number / 62;
        }
        return result.reverse().toString();
    }

    @Override
    public String shorten(String longUrl) {
        int hash = longUrl.hashCode();
        long number = Integer.toUnsignedLong(hash);

        return convertToBase62(number);
    }
}
