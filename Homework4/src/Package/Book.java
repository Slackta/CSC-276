package Package;

public class Book extends LibraryItem {
    private int pages;

    public Book(String title, String author, int pages) {
        super(title, author);
        this.pages = pages;
    }

    @Override
    public String toString() {
        return super.toString() + ", Pages: " + pages;
    }
}