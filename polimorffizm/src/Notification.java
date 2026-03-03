public abstract class Notification {
    protected String recipient;

    public Notification(String recipient) {
        this.recipient = recipient;
    }

    public void send(String message) {
        String formatted = formatMessage(message);
        System.out.println("Sending to " + recipient + ": " + formatted);
    }

    abstract String formatMessage(String message);
}