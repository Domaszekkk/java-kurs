import java.math.BigDecimal;
import java.util.List;

public class Product {
    private final String id;
    private final String name;
    private final ProductType productType;
    private final BigDecimal basePrice;
    private final List<Configuration> availableConfigurations;
    private final long quantity;

    public Product(String id,
                   String name,
                   ProductType productType,
                   BigDecimal basePrice,
                   List<Configuration> availableConfigurations,
                   long quantity) {
        this.id = id;
        this.name = name;
        this.productType = productType;
        this.basePrice = basePrice;
        this.availableConfigurations = availableConfigurations;
        this.quantity = quantity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ProductType getProductType() {
        return productType;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public List<Configuration> getAvailableConfigurations() {
        return availableConfigurations;
    }

    public long getQuantity() {
        return quantity;
    }

}
