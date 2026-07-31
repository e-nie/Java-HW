package mock_prep.OOP_tasks_1.map_tasks.phone_book;

public class Main {
    static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.addContact("Eddy", "45645488");
        phonebook.addContact("Milo", "45464");
        phonebook.addContact("Alan", "87854");
        phonebook.addContact("Caith", "21212");
        phonebook.addContact("Heather", "123322");

        System.out.println(phonebook.getContactsCount());//5

        phonebook.removeContact("Eddy");
        System.out.println(phonebook.getContactsCount());//4

        System.out.println(phonebook.getPhone("Milo"));//45464

        System.out.println(phonebook.contains("Alan"));//true
        System.out.println(phonebook.contains("Ira"));//false











    }
}
