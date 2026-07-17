package mock_prep.OOPTasks.map_tasks.phoneBook;

public class Main {
    static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Anna", "12345");
        phoneBook.addContact("Ella", "9874");
        phoneBook.addContact("Olly", "3215");
        phoneBook.addContact("Klara", "45456");
        phoneBook.addContact("Kevin", "1474");

        System.out.println(phoneBook.getContactsCount());
        phoneBook.removeContact("Ella");
        System.out.println(phoneBook.contains("Ella"));
        System.out.println(phoneBook.getContactsCount());
        System.out.println(phoneBook.getPhone("Anna"));
        System.out.println(phoneBook.contains("Klara"));
        phoneBook.addContact("Klara", "111111");
        System.out.println(phoneBook.getPhone("Klara"));



    }
}
