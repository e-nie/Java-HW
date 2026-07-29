package mock_prep.OOP_tasks_1.composition_aggregation.library_service;

public class BookItem {
    private Book book;
    private String inventoryCode;
    private BookStatus status;


    public BookItem(Book book, String inventoryCode) {
        this.book = book;
        this.inventoryCode = inventoryCode;
        this.status = BookStatus.AVAILABLE;

    }

    public Book getBook() {
        return book;
    }

    public String getInventoryCode() {
        return inventoryCode;
    }

    public void lendBook(){
        this.status = BookStatus.LENT;
    }

    public void returnBook(){
        this.status = BookStatus.AVAILABLE;
    }

    public boolean isBookAvailable(){
       return this.status == BookStatus.AVAILABLE;
    }

    public String toString(){
        return "Title: " + book.getTitle() + ", Author: " + book.getAuthor() + ", ISBN: " + book.getISBN() +
                " Status: " + status;
    }

}
