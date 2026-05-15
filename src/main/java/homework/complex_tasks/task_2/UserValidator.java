package homework.complex_tasks.task_2;

public class UserValidator {
    private boolean validationEnabled=true;

    public void checkName(User user) {
        if (!validationEnabled) {
            return;
        }
        if (user == null
                || user.getName() == null
                || user.getName().isEmpty()
                || !Character.isUpperCase(user.getName().charAt(0))) {
            throw new InvalidUserException(
                    "Name must start with uppercase letter"
            );
        }

    }

    public void checkAge(User user) {
        if (!validationEnabled) {
            return;
        }
        if (user == null
                || user.getAge() < 18
                || user.getAge() > 100) {
            throw new InvalidUserException(
                    "Age must  be between 18 and 100"
            );
        }
    }

    public void checkEmail(User user) {
        if (!validationEnabled) {
            return;
        }
        String regex = "^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,}$";
        if (user == null
                || user.getEmail() == null
                || !user.getEmail().matches(regex))
               {
            throw new InvalidUserException(
                    "Invalid Email!"
            );
        }
    }

}

