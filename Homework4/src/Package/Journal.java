package Package;

public class Journal extends LibraryItem {
    private int issueNumber;

    public Journal(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return super.toString() + ", Issue Number: " + issueNumber;
    }

    @Override
    public void displayDetails() {
        System.out.println("Journal Item:");
        super.displayDetails();
        System.out.println("Issue Number: " + issueNumber);
    }
}