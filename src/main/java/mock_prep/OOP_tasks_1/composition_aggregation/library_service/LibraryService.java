package mock_prep.OOP_tasks_1.composition_aggregation.library_service;

import java.util.ArrayList;
import java.util.List;

public class LibraryService {
    public String name;
    public List<BookItem> bookItems;

    public LibraryService(String name) {
        this.name = name;
        this.bookItems = new ArrayList<>();
    }

    public void addBook(Book book, String inventoryCode) {
        BookItem bookItem = new BookItem(book, inventoryCode);
        bookItems.add(bookItem);
    }

    public void lendBook(String title) {
        for (BookItem item : bookItems) {
            if (item.getBook().getTitle().equals(title) && item.isBookAvailable()) {
                item.lendBook();
            }
        }
    }

    public void returnBook(String inventoryCode) {
        for (BookItem item : bookItems) {
            if (item.getInventoryCode().equals(inventoryCode)) {
                item.returnBook();
            }
        }
    }

    public void showAvailableBooks(){
        for(BookItem item: bookItems){
            System.out.println(item);
        }
    }
}
