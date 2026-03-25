package practice_8.exceptions.unchecked;

public class NullPointerExceptionExample {
    static void main(String[] args) {
        try{
            String text = null;
            int length = text.length();
        } catch (NullPointerException e) {
            System.out.println("Attempt to call a method on a null object");
        }
    }
}
