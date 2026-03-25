package practice_8.generics;

import practice_8.library.Library;

public class Main {
    static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Element");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(3);

        Box<Book> boxWithBooks = new Box<>();
        boxWithBooks.setElement(new Book("A book"));

        Box<Magazine> magazine = new Box<>();
    }
}
