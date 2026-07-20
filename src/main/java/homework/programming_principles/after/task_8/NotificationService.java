package homework.programming_principles.after.task_8;

//8. Нарушение DIP (Dependency Inversion Principle) – жесткая зависимость от конкретных классов
public class NotificationService {
    private final MessageSender messageSender;

    public NotificationService(MessageSender messageSender){
        this.messageSender = messageSender;
    }
    public void sendNotification(String message) {
        messageSender.send(message);
    }
}


//Задача: Используйте интерфейсы и внедрение зависимостей, чтобы ослабить связь между классами.
