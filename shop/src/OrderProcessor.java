import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Locale;

public class OrderProcessor {

    public Order createOrder(Cart cart) {
        List<CartItem> items = cart.getItems();
        BigDecimal totalPrice = items.stream()
                .map(item -> {
                    BigDecimal base = item.getProduct().getBasePrice();
                    BigDecimal configSum = item.getChosenConfigurations().stream()
                            .map(config -> config.getPrice())
                            .reduce(BigDecimal.ZERO, BigDecimal::add);
                    BigDecimal itemPrice = base.add(configSum);
                    return itemPrice.multiply(BigDecimal.valueOf(item.getQuantity()));
                })
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return new Order("Order1", items, totalPrice, LocalDateTime.now());
    }

}
