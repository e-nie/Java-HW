package mock_prep.OOP_tasks_1.polymorphism.notification_system;

public abstract class Notification {
    String recipient;
    String notificationText;

    public Notification(String recipient, String notificationText){
        this.notificationText = notificationText;
        this.recipient = recipient;
    }
     public abstract void sendNotification();
}
