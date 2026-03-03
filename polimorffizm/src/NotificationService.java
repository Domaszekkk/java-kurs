import java.util.ArrayList;
import java.util.List;

public class NotificationService {

    private final List<Notification> notifications = new ArrayList<>();

    public void add(Notification notification) {
        notifications.add(notification);
    }

    public void sendAll(String message) {
        for (Notification notification : notifications) {
            notification.send(message);
        }
    }
}