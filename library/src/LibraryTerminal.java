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
    private final LibraryService library;
    private final Scanner scanner;

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
            } catch (AlreadyReturnedException | AlreadyBorrowedException | ItemNotFoundException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void showMenu() {
        System.out.println();
        System.out.print("""
                1.show available items
                2.show borrowed items
                3.borrow item
                4.return item
                5.number of books and movies
                6.exit
                """);
    }

    private void showAvailable() {
        List<LibraryItem> items = library.listItems(false);
        for (LibraryItem item : items) {
            System.out.printf("%s%n", item.getDescription());
        }
    }

    private void showBorrowed() {
        List<LibraryItem> items = library.listItems(true);
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