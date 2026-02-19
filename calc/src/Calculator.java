import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
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
            default -> null;
        } ;
        if (wynik == null) {
            System.out.println("Nieznany operator");
            return;
        }
        System.out.printf("%s %s %s %n",a,operator,b);
        System.out.println(wynik);
        System.out.println(wynik > 0 ? "wynik jest dodatni " : "wynik jest ujemny ");
        System.out.println(wynik %2 == 0 ? "wynik jest parzysty " : "wynik jest nieparzysty ");
    }

}
