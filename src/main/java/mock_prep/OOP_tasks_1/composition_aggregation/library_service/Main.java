package mock_prep.OOP_tasks_1.composition_aggregation.library_service;

public class Main {
    static void main(String[] args) {
        Book book1 = new Book("Gone with the Wind", "M.Mitchell", "4564654");
        Book book2 = new Book("The Power of Now", "E.Tolle", "2313245");
        Book book3 = new Book("Fight Club", "Ch.Palahniuk", "5236698");
        Book book4 = new Book("SPQR", "M.Beard", "1232578");


        LibraryService library = new LibraryService("Prague Library");
        library.addBook(book1,"001");
        library.addBook(book2,"002");
        library.addBook(book3,"003");
        library.addBook(book4,"004");

        library.showAvailableBooks();
        System.out.println();

        library.lendBook("SPQR");
        library.showAvailableBooks();
        System.out.println();

        library.returnBook("004");
        library.showAvailableBooks();

    }
}

