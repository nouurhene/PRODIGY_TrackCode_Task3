package main;
import java.util.ArrayList;

public class contactManager
{

    private static ArrayList<contact> contacts = new ArrayList<>();

    public static void addContact(String name, String phoneNumber, String email) {
        contacts.add(new contact(name, phoneNumber, email));
        System.out.println("Contact added successfully.");
    }

    public static void viewContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts available.");
        } else {
            for (int i = 0; i < contacts.size(); i++) {
                System.out.println((i + 1) + ". " + contacts.get(i));
            }
        }
    }

    public static void editContact(int index, String name, String phoneNumber, String email) {
        if (index >= 0 && index < contacts.size()) {
            contacts.get(index).name = name;
            contacts.get(index).phoneNumber = phoneNumber;
            contacts.get(index).email = email;
            System.out.println("Contact updated successfully.");
        } else {
            System.out.println("Invalid contact index.");
        }
    }

    public static void deleteContact(int index) {
        if (index >= 0 && index < contacts.size()) {
            contacts.remove(index);
            System.out.println("Contact deleted successfully.");
        } else {
            System.out.println("Invalid contact index.");
        }    
    }
}
