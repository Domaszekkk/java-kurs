import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj pierwszą liczbę ");
        Double a = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("podaj operator ");
        char operator = scanner.nextLine().charAt(0);
        System.out.println("podaj drugą liczbę ");
        Double b = scanner.nextDouble();
        scanner.nextLine();
        Double wynik = switch (operator) {
           case '+' -> a + b;
           case '-' -> a - b;
           case '*' -> a * b;
           case '/' -> a / b;
           case '%' -> a % b;
           case '^' -> Math.pow(a, b);
            default -> null;
        } ;
        System.out.printf("%s %s %s %n",a,operator,b);
        System.out.println(wynik);
        System.out.println(wynik > 0 ? "wynik jest dodatni " : "wynik jest ujemny ");
    }

}
