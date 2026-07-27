package mock_prep.OOP_tasks_1.polymorphism.notification_system;

public class EmailNotification extends Notification{


    public EmailNotification(String email, String notificationText) {
        super(email, notificationText);

    }
    @Override
    public void sendNotification(){
        System.out.println("Email is sent on " + recipient + " : " + notificationText) ;
    }
}
