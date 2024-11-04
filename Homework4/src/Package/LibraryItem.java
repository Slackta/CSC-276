package Package;

	public class LibraryItem {
	    protected String title;
	    protected String author;
	    protected boolean isAvailable;

	    public LibraryItem(String title, String author) {
	        this.title = title;
	        this.author = author;
	        this.isAvailable = true;
	    }

	    public void checkOut() {
	        if (isAvailable) {
	            isAvailable = false;
	            System.out.println(title + " has been checked out.");
	        } else {
	            System.out.println(title + " is already checked out.");
	        }
	    }

	    public void returnItem() {
	        isAvailable = true;
	        System.out.println(title + " has been returned.");
	    }

	    @Override
	    public String toString() {
	        return "Title: " + title + ", Author: " + author;
	    }

	    public void displayDetails() {
	        System.out.println("Title: " + title);
	        System.out.println("Author: " + author);
	        System.out.println("Available: " + isAvailable);
	    }
	}