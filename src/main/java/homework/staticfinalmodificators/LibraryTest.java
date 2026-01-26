package homework.staticfinalmodificators;

public class LibraryTest {


     static void main(String[] args) {

        Library newLibrary = new Library("Saga", "Osho", 1234, "Horror");
        System.out.println("Book Title: " + newLibrary.getBookTitle() + "Autor: " + newLibrary.author + ", Year: " + newLibrary.year + ", Category: " + newLibrary.category);
    }
}
