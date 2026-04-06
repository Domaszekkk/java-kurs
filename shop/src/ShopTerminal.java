import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class ShopTerminal {
    private ProductManager productManager;
    private Cart cart;
    private OrderProcessor orderProcessor;
    private Scanner scanner;

    public ShopTerminal() {
        this.productManager = new ProductManager();
        this.cart = new Cart();
        this.orderProcessor = new OrderProcessor();
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine();
            switch (option) {
                case 1 -> showProducts();
                case 2 -> addToCart();
                case 3 -> showCart();
                case 4 -> placeOrder();
                case 5 -> running = false;
                default -> System.out.println("inappropriate option mordeczko");
            }
        }
    }

    public void showMenu() {
        System.out.println();
        System.out.print("""
                1. show products
                2. add to cart
                3. show cart
                4. place order
                5. exit
                """);
    }


    public void showProducts() {
        productManager.displayProducts();
    }

    public void addToCart() {
        System.out.printf("enter product id: ");
        String id = scanner.nextLine();
        Product product = productManager.findProduct(id);
        if (product == null) {
            System.out.printf("product not found%n");
            return;
        }
        System.out.printf("enter quantity: ");
        long quantity = scanner.nextLong();
        scanner.nextLine();
        List<Configuration> configs = new ArrayList<>();
        CartItem item = new CartItem(product, quantity, configs);
        cart.addItem(item);
        System.out.printf("added to cart%n");
    }

    public void showCart() {
        cart.displayCart();
    }

    public void placeOrder() {
        Order order = cart.placeOrder(orderProcessor);
        System.out.printf("order placed, total: %s%n", order.getTotalPrice());
    }
}
