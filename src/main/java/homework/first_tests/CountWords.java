package homework.first_tests;

public class CountWords {
//    public int countWords(String sentence) {
//        return sentence.trim().isEmpty() ? 0 : sentence.split("\\s+").length;
//    }

    //fixed method (string is immutable -> trim method works incorrectly)
    public int countWords(String sentence) {
        String trimmed = sentence.trim();
        return trimmed.isEmpty() ? 0 : trimmed.split("\\s+").length;
    }
}
