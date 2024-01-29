package linkesList;


import java.util.LinkedList;

class Contact {
        String name;
        String phoneNumber;
        public Contact(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }
    }
    class ContactList {
        LinkedList<Contact> contacts = new LinkedList<>();
        public void addContact(String name, String phoneNumber) {
            Contact contact = new Contact(name, phoneNumber);
            contacts.add(contact);
        }
        public Contact searchContact(String name) {
            for (Contact contact : contacts) {
                if (contact.name.equalsIgnoreCase(name)) {
                    return contact;
                }
            }
            return null;
        }
        public void displayContacts() {
            System.out.println("Contact List:");
            for (int i = 0; i < contacts.size(); i++) {
                Contact contact = contacts.get(i);
                System.out.println((i + 1) + ". " + contact.name +
                        " - Phone: " + contact.phoneNumber);
            }
        }
    }
    public class Assignment {
        public static void main(String[] args) {
            ContactList contactList = new ContactList();
            contactList.addContact("William Johnson", "123-456-7890");
            contactList.addContact("Elton Smith", "987-654-3210");
            contactList.addContact("Mary Brown", "555-555-5555");
            System.out.println("Initial Contact List:");
            contactList.displayContacts();
            String searchName = "Elton Smith";
            Contact foundContact = contactList.searchContact(searchName);
            if (foundContact != null) {
                System.out.println("\nFound Contact:");
                System.out.println("Name: " + foundContact.name +
                        " - Phone: " + foundContact.phoneNumber);
            } else {
                System.out.println("\nContact not found: " + searchName);
            }
        }
    }