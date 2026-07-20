package homework.programming_principles.after.task_8;

public class Main {
    static void main(String[] args) {
        MessageSender emailSender = new EmailSender();
        NotificationService service = new NotificationService(emailSender);
        service.sendNotification("Your order has been shipped");
    }
}
