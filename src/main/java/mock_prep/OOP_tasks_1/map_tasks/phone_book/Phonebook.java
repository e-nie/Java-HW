package mock_prep.OOP_tasks_1.map_tasks.phone_book;

import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    private Map<String, String> contacts = new HashMap<>();

    public void addContact(String name, String phone) {
        contacts.put(name, phone);
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public String getPhone(String name){
        return contacts.get(name);
    }

    public boolean contains( String name) {
        return contacts.containsKey(name);
    }

    public int getContactsCount(){
        return contacts.size();
    }
}
