import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("wprowadz równanie");
            double a = scanner.nextDouble();
            char operator = scanner.next().charAt(0);
            double b = scanner.nextDouble();
            Double wynik = switch (operator) {
                case '+' -> a + b;
                case '-' -> a - b;
                case '*' -> a * b;
                case '/' -> {
                    if (b == 0) {
                        System.out.println("ndrd przez zero ");
                        yield null;
                    }
                    yield a / b;
                }
                case '%' -> {
                    if (b == 0) {
                        System.out.println("ndrd przez zero ");
                        yield null;
                    }
                    yield a % b;
                }
                case '^' -> Math.pow(a, b);
                default -> {
                    System.out.println("nieznany operator ");
                    yield null;
                }
            };
            if (wynik == null) {
                System.out.println("spróbuj ponowinie ");
                continue;
            }
            System.out.printf("%s %s %s %n", a, operator, b);
            System.out.println(wynik);
            System.out.println(wynik > 0 ? "wynik jest dodatni " : "wynik jest ujemny ");
            System.out.println(wynik % 2 == 0 ? "wynik jest parzysty " : "wynik jest nieparzysty ");
            System.out.println("Czy chcesz kontynuować? (y/n)");
            char decyzja = scanner.next().charAt(0);
            if (decyzja == 'n') {
                break;
            }
        }
    }
}

