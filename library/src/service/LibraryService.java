package service;

import excpetion.AlreadyReturnedException;
import excpetion.ItemNotFoundException;
import model.LibraryItem;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    private final List<LibraryItem> items = new ArrayList<>();

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public List<LibraryItem> listAll() {
        return items;
    }

    public List<LibraryItem> showAvailableItems() {
        List<LibraryItem> available = new ArrayList<>();
        for (LibraryItem item : items) {
            if (!item.isBorrowed()) {
                available.add(item);
            }
        }
        return available;
    }

    public List<LibraryItem> showBorrowedItems() {
        List<LibraryItem> borrowed = new ArrayList<>();
        for (LibraryItem item : items) {
            if (item.isBorrowed()) {
                borrowed.add(item);
            }
        }
        return borrowed;
    }

    public LibraryItem findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return item;
            }
        }
        throw new ItemNotFoundException("title not found: " + title);
    }

    public void borrowItem(String title) {
        LibraryItem item = findItemByTitle(title);
        item.borrow();
    }

    public void returnItem(String title) throws AlreadyReturnedException {
        LibraryItem item = findItemByTitle(title);
        item.returnItem();
    }
}


//Stwórz program w Javie, który umożliwia zarządzanie biblioteką za pomocą interaktywnego menu w terminalu.
// Program powinien obsługiwać książki i filmy, pozwalając użytkownikowi na przeglądanie, wypożyczanie oraz zwracanie elementów.
//Wymagania funkcjonalne:
//
//Elementy biblioteki:
//Książka (model.Book): zawiera tytuł, autora i liczbę stron.
//Film (model.Movie): zawiera tytuł, reżysera i czas trwania w minutach.
//ps chcemy stworzyć abstrakcje nad tymi elementami np model.LibraryItem by móc zastosować polimorfizm
//
//Interfejs użytkownika:
//Wyświetlanie listy dostępnych i wypożyczonych elementów.
//Wypożyczanie elementu po tytule.
//Zwracanie elementu po tytule.
//Wyświetlanie liczby książek i filmów w systemie.
//Wyjście z programu.
//
//Obsługa wyjątków:
//Rzucaj wyjątki w przypadku błędów, np. element nie istnieje lub jest już wypożyczony.
// albo juz został zwrócony 3 wyjatki 2 unchecked i checked z łapaniem w odpowiednim miejscu i komunikatem dla użytkownika
//
//Dodatkowe wymagania:
//Każdy typ elementu (książki i filmy) powinien mieć statyczny licznik obiektów.