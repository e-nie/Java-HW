package practice_7.contactBook;

import java.util.HashMap;

public class ContactBook {
    // ключ-значение (имя-телефон)
    private HashMap<String, Integer> contacts;

    public ContactBook() {
        this.contacts = new HashMap<>();
    }

    //добавить контакт
    public void addContact(String name, Integer phone) {
        contacts.put(name, phone);
    }

    // поиск контакта по имени
    public Integer getPhone(String name) {
        return contacts.get(name);
    }

    // обновление контакта по имени
    public void updatePhone(String name, Integer updatedPhone) {
        contacts.put(name, updatedPhone);
    }

    public void printContacts() {
        System.out.println("All Contacts: ");
        contacts.forEach(
                (name, phone) -> {
                    System.out.println("Name: " + name + ", Phone: " + phone);
                }
        );
        System.out.println();
    }
}
