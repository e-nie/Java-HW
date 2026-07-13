package mock_prep.OOPTasks.composition_aggregation.library;

public class Main {
    static void main(String[] args) {
        Library library  = new Library("City Library");
        Book book1 = new Book("The Forsyth Saga", "J. Galsworthy", "9789358391824");
        Book book2 = new Book("1984", "G. Orwell", "9789358951824");
        Book book3 = new Book("Master and Margherita", "M.Bulgakov", "97836958391824");
        Book book4 = new Book("The Power of now", "E. Tolle", "0065358391824");
        library.addBook(book1, "EN-001");
        library.addBook(book2, "EN-002");
        library.addBook(book3, "RU-003");
        library.addBook(book4, "EN-004");

        library.showAvailableBooks();
        library.lendBook("1984");
        library.showAvailableBooks();

        library.returnBook("EN-002");
        library.showAvailableBooks();
    }
}
