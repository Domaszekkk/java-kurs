import java.util.Scanner;

public class Piramida {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj wysokość ");
        int wysokosc = scanner.nextInt();

        for (int i = 1; i <= wysokosc; i++) {

            for (int j = 0; j <= wysokosc - i - 1; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
