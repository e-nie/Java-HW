package mock_prep.OOPTasks.polymorphism.notification_system;

public class EmailNotification extends Notification {

    public EmailNotification(String recipient, String messageText) {
        super(recipient, messageText);
    }

    @Override
    public void send() {
        System.out.println("Email sent to " + recipient + " : " + messageText);
    }
}
