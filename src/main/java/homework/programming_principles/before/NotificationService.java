package homework.programming_principles.before;
//8. Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов
public class NotificationService {
    private EmailSender emailSender = new EmailSender();
    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}
class EmailSender {
    public void sendEmail(String message) {
        System.out.println("Отправка email: " + message);
    }
}

//Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.
