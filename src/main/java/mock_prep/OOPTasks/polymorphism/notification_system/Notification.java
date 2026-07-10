package mock_prep.OOPTasks.polymorphism.notification_system;

abstract class Notification {
    protected String recipient;
    protected String messageText;

    public Notification(String recipient, String messageText) {
        this.recipient = recipient;
        this.messageText = messageText;
    }
    public abstract void send();
}
