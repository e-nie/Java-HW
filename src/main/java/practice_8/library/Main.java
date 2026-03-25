package practice_8.library;

import practice_8.library.exceptions.BookNotFoundException;

public class Main {
    static void main(String[] args) {
    Library library = new Library();
    library.addBook(new Book("The History of Mankind", "J.Turner"));
    library.addBook(new Book("S.P.Q.R", "Mary Beard"));
    library.addBook(new Book("Consuelo", "George Sand"));
//    library.addBook(new Book("Consuelo", "George Sand"));

        try {
            library.findBook("Faust");
        } catch (BookNotFoundException e) {
            System.out.println("Exception caught!");
        }
    }

}
