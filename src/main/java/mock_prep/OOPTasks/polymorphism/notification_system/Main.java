package mock_prep.OOPTasks.polymorphism.notification_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {

        List<Notification> notifications = new ArrayList<>();
        notifications.add(new EmailNotification("evchen@evchen.com", "You are wonderful!"));
        notifications.add(new SMSNotification("+49-456-123289", "Your confirmation code is: 456"));
        notifications.add(new PushNotification("device 478", "You have a new message"));

        NotificationSystem system = new NotificationSystem();
        system.sendAll(notifications);
    }
}
