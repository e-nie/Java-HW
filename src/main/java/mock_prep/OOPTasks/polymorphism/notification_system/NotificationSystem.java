package mock_prep.OOPTasks.polymorphism.notification_system;

import java.util.List;

public class NotificationSystem {
    public void sendAll(List<Notification> notifications) {
        for(Notification notification: notifications) {
            notification.send();
        }
    }
}
