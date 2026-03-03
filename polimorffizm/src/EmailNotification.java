public class EmailNotification extends Notification {
    public EmailNotification(String recipient) {
        super(recipient);
    }
    @Override
    String formatMessage(String message) {
        return "\nemail message\n"
                + "to: " + recipient + "\n"
                + "theme: " + message + "\n";

    }
}