package homework.first_tests;

public class IsValidEmail {
    public boolean isValidEmail(String email) {
        return email != null && email.matches("^[\\w.-]+@[\\w.-]+\\.\\w{2,}$");
    }
}
