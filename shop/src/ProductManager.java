import java.util.List;
import java.util.ArrayList;

public class ProductManager {
    List<Product> products = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void removeProduct(String id) {
        products.removeIf(p -> p.getId().equals(id));
    }

    Product findProduct(String id) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    void displayProducts() {
        for (Product p : products) {
            System.out.printf("ID: %s NAME: %s PRICE: %.2f%n",
                    p.getId(),
                    p.getName(),
                    p.getBasePrice());
        }
    }
}
