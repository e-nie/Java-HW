package mock_prep.OOP_tasks_1.polymorphism.notification_system;

public class SmsNotification extends Notification {

    public SmsNotification(String phoneNumber, String notificationText) {
        super(phoneNumber, notificationText);

    }

    @Override
    public void sendNotification() {
        System.out.println("SMS is sent on " + recipient + " : " + notificationText);
    }
}
