import java.util.ArrayList;
import java.util.List;

public class Cart {
    private List<CartItem> items = new ArrayList<>();

    public void addItem(CartItem item) {
        items.add(item);
    }

    public void displayCart() {
        items.stream().forEach(item -> {
            System.out.printf("id: %s name: %s quantity: %d%n",
                    item.getProduct().getId(),
                    item.getProduct().getName(),
                    item.getQuantity()
            );
        });
    }

}
