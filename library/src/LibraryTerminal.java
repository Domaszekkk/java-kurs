import excpetion.AlreadyBorrowedException;
import excpetion.AlreadyReturnedException;
import excpetion.ItemNotFoundException;
import model.Book;
import model.LibraryItem;
import model.Movie;
import service.LibraryService;

import java.util.List;
import java.util.Scanner;

public class LibraryTerminal {
    private LibraryService library;
    private Scanner scanner;

    public LibraryTerminal(LibraryService library) {
        this.library = library;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        boolean running = true;

        while (running) {
            showMenu();
            int option = scanner.nextInt();
            scanner.nextLine();

            try {
                switch (option) {
                    case 1 -> showAvailable();
                    case 2 -> showBorrowed();
                    case 3 -> borrowItem();
                    case 4 -> returnItem();
                    case 5 -> showCounts();
                    case 6 -> running = false;
                    default -> System.out.println("inappropriate option mordeczko");
                }
            } catch (AlreadyReturnedException | AlreadyBorrowedException | ItemNotFoundException e ) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void showMenu() {
        System.out.println();
        System.out.println("1.show avaiable items");
        System.out.println("2.show borrowed items");
        System.out.println("3.borrow item");
        System.out.println("4.return item");
        System.out.println("5.number of books and movies");
        System.out.println("6.exit");
    }

    private void showAvailable() {
        List<LibraryItem> items = library.showAvailableItems();
        for (LibraryItem item : items) {
            System.out.printf("%s%n", item.getDescription());
        }
    }

    private void showBorrowed() {
        List<LibraryItem> items = library.showBorrowedItems();
        for (LibraryItem item : items) {
            System.out.printf("%s%n", item.getDescription());
        }
    }

    public void borrowItem() {
        System.out.print("input title ");
        String title = scanner.nextLine();
        library.borrowItem(title);

        System.out.printf("borrowed: %s%n", title);
    }

    private void returnItem() throws AlreadyReturnedException {
        System.out.print("input title ");
        String title = scanner.nextLine();
        library.returnItem(title);

        System.out.printf("returned: %s%n", title);
    }

    private void showCounts() {
        System.out.printf("numbers of books: %d%n", Book.getCount());
        System.out.printf("numbers of movies: %d%n", Movie.getCount());
    }
}