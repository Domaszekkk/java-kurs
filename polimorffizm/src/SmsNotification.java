public class SmsNotification extends Notification {
    public SmsNotification(String recipient) {
        super(recipient);
    }

    @Override
    String formatMessage(String message) {
        if (message.length() > 160) {
            return message.substring(0, 160);
        }
        return message;
    }
}