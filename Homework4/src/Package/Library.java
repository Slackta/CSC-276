package Package;

import java.util.ArrayList;

public class Library {
    private ArrayList<LibraryItem> items;

    public Library() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void displayItems() {
        for (LibraryItem item : items) {
            item.displayDetails();
            System.out.println();
        }
    }

    public void checkOutItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).checkOut();
        } else {
            System.out.println("Invalid index.");
        }
    }

    public void returnItem(int index) {
        if (index >= 0 && index < items.size()) {
            items.get(index).returnItem();
        } else {
            System.out.println("Invalid index.");
        }
    }
}