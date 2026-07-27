package mock_prep.OOP_tasks_1.polymorphism.notification_system;

public class PushNotification extends Notification{


    public PushNotification(String deviceId, String notificationText) {
        super(deviceId, notificationText);

    }

    @Override
    public void sendNotification(){
        System.out.println("Push notification is sent on " + recipient + " : " + notificationText) ;
    }
}
