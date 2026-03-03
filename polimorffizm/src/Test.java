public class Test {
    public static void main(String[] args) {

        NotificationService service = new NotificationService();

        service.add(new EmailNotification("john@example.com"));
        service.add(new SmsNotification("+48123456789"));
        service.add(new PushNotification("device-token-123"));

        service.sendAll("Hello World! This is a test message.");
    }
}