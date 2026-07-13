package mock_prep.OOPTasks.composition_aggregation.library;

public class BookItem {
    private String inventoryCode;
    private BookStatus status;
    private Book book;

    public BookItem( Book book, String inventoryCode) {
        this.inventoryCode = inventoryCode;
        this.book = book;
        this.status = BookStatus.AVAILABLE;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public BookStatus getStatus() {
        return status;
    }

    public Book getBook() {
        return book;
    }

    public boolean isAvailable() {
        return status == BookStatus.AVAILABLE;
    }

    public void lend() {
        status = BookStatus.LENT;

    }

    public void returnBack() {
        status = BookStatus.AVAILABLE;
    }
}
