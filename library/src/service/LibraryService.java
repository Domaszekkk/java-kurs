package service;

import excpetion.AlreadyReturnedException;
import excpetion.ItemNotFoundException;
import model.LibraryItem;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Optional <LibraryItem> findItemByTitle(String title) {
        for (LibraryItem item : items) {
            if (item.getTitle().equalsIgnoreCase(title)) {
                return Optional.of(item);
            }
        }
        return Optional.empty();
    }

    public void borrowItem(String title) {
        LibraryItem item = findItemByTitle(title).orElseThrow(() -> new ItemNotFoundException("item not found; " + title));
        item.borrow();
    }

    public void returnItem(String title) throws AlreadyReturnedException {
        LibraryItem item = findItemByTitle(title).orElseThrow(() -> new ItemNotFoundException ("item not found: " + title));
        item.returnItem();
    }
}