import model.Book;
import model.Movie;
import service.LibraryService;

public class Test {
    public static void main(String[] args) {
        LibraryService library = new LibraryService();
        library.addItem(new Book("Hobbit", "Tolkien", 295));
        library.addItem(new Book("Wiedzmin", "Sapkowski", 320));
        library.addItem(new Movie("Matrix", "Wachowski", 136));
        library.addItem(new Movie("Incepcja", "Nolan", 148));
        LibraryTerminal terminal = new LibraryTerminal(library);
        terminal.start();
    }
}