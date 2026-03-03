public class PushNotification extends Notification {
    public PushNotification(String recipient) {
        super(recipient);
    }

    @Override
    String formatMessage(String message) {
        return "PUSH: " + message;
    }
}