import java.util.List;
import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Order {
    private final String orderId;
    private final List<CartItem> items;
    private final BigDecimal totalPrice;
    private final LocalDateTime orderTime;

    public Order(String orderId, List<CartItem> items, BigDecimal totalPrice, LocalDateTime orderTime) {
        this.orderId = orderId;
        this.items = items;
        this.totalPrice = totalPrice;
        this.orderTime = orderTime;
    }

    public String getOrderId() {
        return orderId;
    }

    public List<CartItem> getItems() {
        return items;
    }

    public BigDecimal getTotalPrice() {
        return totalPrice;
    }

    public LocalDateTime getOrderTime() {
        return orderTime;
    }
}
