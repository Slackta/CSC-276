package Package;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addItem(new Book("Java Programming", "Paul Deitel", 1143));
        library.addItem(new Journal("Machine Learning", "Manuel Gunther", 12));

        System.out.println("All Library Items:");
        library.displayItems();

        System.out.println("\nAfter Checking Out:");
        library.checkOutItem(0);
        library.displayItems();

        System.out.println("\nAfter Returning:");
        library.returnItem(0);
        library.displayItems();
    }
}