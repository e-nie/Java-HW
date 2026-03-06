package practice_7.contactBook;

public class Main {
    static void main(String[] args) {
        ContactBook contactBook  = new ContactBook();
        contactBook.addContact("Leo", 225566);
        contactBook.addContact("Sane", 22899866);
        contactBook.addContact("Sven", 55555);
        contactBook.addContact("Kale", 777);
        contactBook.addContact("Clode", 66666);
        contactBook.addContact("Rene", 11111);

        contactBook.printContacts();

        contactBook.updatePhone("Sane",123 );
        contactBook.printContacts();
    }
}
