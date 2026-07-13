package mock_prep.OOPTasks.composition_aggregation.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private String name;
    private List<BookItem> items;

    public Library(String name) {
        this.name = name;
        this.items = new ArrayList<>();
    }

    public void addBook(Book book, String inventoryCode) {
        BookItem item = new BookItem(book, inventoryCode);
        items.add(item);
    }

    public void lendBook(String title) {
        for (BookItem item : items) {
            if (title.equals(item.getBook().getTitle())) {
                if (item.isAvailable()) {
                    item.lend();
                    return;
                }
            }
        }

    }

    public void returnBook(String inventoryCode) {
        for (BookItem item : items) {
            if (inventoryCode.equals(item.getInventoryCode())) {
                item.returnBack();
                return;
            }
        }

    }

    public void showAvailableBooks() {
        for (BookItem item : items) {
            if (item.isAvailable()) {
                System.out.println(item.getBook().getTitle() + " - "
                        + item.getBook().getAuthor() + " - "
                        + item.getBook().getIsbn() + " ");
            }
        }
    }


}
