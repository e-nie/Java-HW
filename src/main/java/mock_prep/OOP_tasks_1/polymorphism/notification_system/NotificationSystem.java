package mock_prep.OOP_tasks_1.polymorphism.notification_system;

import java.util.ArrayList;
import java.util.List;

public class NotificationSystem {

      public void sendAll(List<Notification> notificationList){
        for(Notification notification: notificationList){
            notification.sendNotification();
        }
    }
}
