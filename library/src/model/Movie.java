package model;

public class Movie extends LibraryItem {
    private final String director;
    private final int duration;

    private static int count = 0;

    public Movie(String title, String director, int duration) {
        super(title);
        this.director = director;
        this.duration = duration;
        count++;
    }
    public static int getCount() {
        return count;
    }
    @Override
    public String getDescription() {
        return String.format("movie - title: %s, director: %s duartion: %d", title, director, duration);
    }
}
