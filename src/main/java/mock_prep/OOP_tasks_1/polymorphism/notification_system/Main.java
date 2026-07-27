package mock_prep.OOP_tasks_1.polymorphism.notification_system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    static void main(String[] args) {


    Notification emailNotification = new EmailNotification("evchen@gmail.com", "Your order is ready");
    Notification smsNotification = new SmsNotification("+63765735-7873", "Your confirmation code is 1256");
    Notification pushNotification = new PushNotification("device -777", "You have a new message");


    NotificationSystem system = new NotificationSystem();
    List<Notification> notificationList = new ArrayList<>();
    notificationList.add(emailNotification);
    notificationList.add(smsNotification);
    notificationList.add(pushNotification);

    system.sendAll(notificationList);
    }
}
