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

    public List<LibraryItem> listItems(boolean borrowed) {
        return items.stream()
                .filter(item -> item.isBorrowed() == borrowed)
                .toList();
    }

    public Optional<LibraryItem> findItemByTitle(String title) {
        return items.stream()
                .filter(item -> item.getTitle().equalsIgnoreCase(title))
                .findFirst();
    }

    public void borrowItem(String title) {
        LibraryItem item = findItemByTitle(title).orElseThrow(() -> new ItemNotFoundException("item not found; " + title));
        item.borrow();
    }

    public void returnItem(String title) throws AlreadyReturnedException {
        LibraryItem item = findItemByTitle(title).orElseThrow(() -> new ItemNotFoundException("item not found: " + title));
        item.returnItem();
    }
}