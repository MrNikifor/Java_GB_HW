package GB_HW.Java_API.Seminar5.Task1;

import java.util.*;

public class PhoneBook {
    private Map<String, List<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        List<String> phoneNumbers = contacts.getOrDefault(name, new ArrayList<>());
        phoneNumbers.add(phoneNumber);
        contacts.put(name, phoneNumbers);
    }

    public List<String> getPhoneNumbers(String name) {
        return contacts.getOrDefault(name, new ArrayList<>());
    }

    public void removeContact(String name) {
        contacts.remove(name);
    }

    public void displayContacts() {
        for (Map.Entry<String, List<String>> entry : contacts.entrySet()) {
            String name = entry.getKey();
            List<String> phoneNumbers = entry.getValue();
            System.out.println("Name: " + name);
            System.out.println("Phone Numbers: " + phoneNumbers);
            System.out.println("---------------------------");
        }
    }

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        phoneBook.addContact("John", "1234567890");
        phoneBook.addContact("John", "9876543210");
        phoneBook.addContact("Alice", "5555555555");

        phoneBook.displayContacts();

        List<String> johnPhoneNumbers = phoneBook.getPhoneNumbers("John");
        System.out.println("John's Phone Numbers: " + johnPhoneNumbers);

        phoneBook.removeContact("Alice");

        phoneBook.displayContacts();
    }
}
