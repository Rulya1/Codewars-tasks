package UdemyJavaCourse.Section10.ListIteratorAutoBoxing;

import java.util.ArrayList;
import java.util.Objects;

public class MobilePhone {
    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String phoneNumber) {
        this.myNumber = phoneNumber;
        this.myContacts = new ArrayList<>();
    }

    public boolean addNewContact(Contact contact) {

        if (findContact(contact) != -1) {
            return false;
        } else {
            return myContacts.add(contact);
        }
    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        if (findContact(oldContact) != -1) {
            return myContacts.remove(oldContact) && myContacts.add(newContact);
        } else {
            return false;
        }
    }

    public boolean removeContact(Contact contact) {
        return findContact(contact) == -1 ? false : myContacts.remove(contact);
    }

    private int findContact(Contact queryContact) {
        return findContact(queryContact.getName());
    }

    private int findContact(String contactName) {
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public Contact queryContact(String contactName) {

        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return contact;
            }
        }
        return null;
    }

    public void printContacts() {
        System.out.println("Contact List:");
        for (int i = 0; i < myContacts.size(); i++) {
            Contact contact = myContacts.get(i);
            System.out.println(i+1 + ". " + contact.getName() + " -> " + contact.getPhoneNumber());
        }
    }

}
 class Contact {
    private String name;
    private String phoneNumber;

     public Contact(String name, String phoneNumber) {
         this.name = name;
         this.phoneNumber = phoneNumber;
     }

     public String getName() {
         return name;
     }

     public String getPhoneNumber() {
         return phoneNumber;
     }
     public static Contact createContact(String name, String phoneNumber){
         return new Contact(name , phoneNumber);
     }

     @Override
     public boolean equals(Object o) {
         if (this == o) return true;
         if (o == null || getClass() != o.getClass()) return false;
         Contact contact = (Contact) o;
         return name.equals(contact.name) && phoneNumber.equals(contact.phoneNumber);
     }

     @Override
     public int hashCode() {
         return Objects.hash(name, phoneNumber);
     }
 }
