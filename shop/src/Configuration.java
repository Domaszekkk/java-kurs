import java.math.BigDecimal;

public class Configuration {
    private final ConfigurationType type;
    private final String name;
    private final BigDecimal price;

    public Configuration(ConfigurationType type, String name, BigDecimal price) {
        this.type = type;
        this.name = name;
        this.price = price;
    }

    public ConfigurationType getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public BigDecimal getPrice() {
        return price;
    }
}
