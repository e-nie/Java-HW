package mock_prep.OOPTasks.polymorphism.notification_system;

public class PushNotification extends Notification {

    public PushNotification(String recipient, String messageText) {
        super(recipient, messageText);
    }

    @Override
    public void send() {
        System.out.println("Push sent to " + recipient + " : " + messageText);

    }
}
