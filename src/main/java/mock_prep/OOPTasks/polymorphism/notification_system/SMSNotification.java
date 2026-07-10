package mock_prep.OOPTasks.polymorphism.notification_system;

public class SMSNotification extends Notification{
    public SMSNotification(String recipient, String messageText) {
        super(recipient, messageText);
    }

    @Override
    public void send(){
        System.out.println("SMS sent to " + recipient + " : " + messageText);
    }
}
