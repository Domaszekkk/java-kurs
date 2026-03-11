package model;

public class Book extends LibraryItem {
    private final String author;
    private final int pages;
    private static int count = 0;

    public Book(String title, String author, int pages) {
        super(title);
        this.author = author;
        this.pages = pages;
        count++;
    }

     public static int getCount() {
        return count;
     }
     @Override
    public String getDescription() {
        return String.format("book - title: %s, author: %s, pages: %d", title, author, pages);
     }
}
