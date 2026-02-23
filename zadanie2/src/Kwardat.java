import java.util.Scanner;

public class Kwardat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj szerokość: ");
        int szerokosc = scanner.nextInt();

        System.out.println("podaj wysokość: ");
        int wysokosc = scanner.nextInt();

        for (int i = 0; i < wysokosc; i++) {
            for (int j = 0; j < szerokosc; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}


