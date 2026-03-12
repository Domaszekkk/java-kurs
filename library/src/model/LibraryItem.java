package model;

import excpetion.AlreadyBorrowedException;
import excpetion.AlreadyReturnedException;

public abstract class LibraryItem {
    protected String title;
    protected boolean borrowed;

    public LibraryItem(String title) {
        this.title = title;
        this.borrowed = false;
    }

    public String getTitle() {
        return title;
    }

    public boolean isBorrowed() {
        return borrowed;
    }

    public void borrow() {
        if (borrowed) {
            throw new AlreadyBorrowedException("is already borrowed, title: " + title);
        }
        borrowed = true;
    }

    public void returnItem() throws AlreadyReturnedException {
        if (!borrowed) {
            throw new AlreadyReturnedException("is already returned, title:  " + title);
        }
        borrowed = false;
    }

    public abstract String getDescription();
}