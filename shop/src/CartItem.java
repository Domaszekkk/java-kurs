import java.util.List;

public class CartItem {
    private final Product product;
    private final long quantity;
    private final List<Configuration> chosenConfigurations;

    public CartItem(Product product, long quantity, List<Configuration> chosenConfigurations) {
        this.product = product;
        this.quantity = quantity;
        this.chosenConfigurations = chosenConfigurations;
    }

    public Product getProduct() {
        return product;
    }

    public long getQuantity() {
        return quantity;
    }

    public List<Configuration> getChosenConfiguration() {
        return chosenConfigurations;
    }
}
