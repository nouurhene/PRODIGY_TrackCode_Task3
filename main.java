package main;
import java.util.*;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		 Scanner scanner = new Scanner(System.in);

	        while (true) {
	            System.out.println("\nContact Manager");
	            System.out.println("1. Add Contact");
	            System.out.println("2. View Contacts");
	            System.out.println("3. Edit Contact");
	            System.out.println("4. Delete Contact");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            int choice = scanner.nextInt();
	            scanner.nextLine();  // Clear the buffer

	            switch (choice) {
	                case 1:
	                    System.out.print("Enter Name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter Phone Number: ");
	                    String phoneNumber = scanner.nextLine();
	                    System.out.print("Enter Email: ");
	                    String email = scanner.nextLine();
	                    contactManager.addContact(name, phoneNumber, email);
	                    break;
	                case 2:
	                	 contactManager.viewContacts();
	                    break;
	                case 3:
	                	 contactManager.viewContacts();
	                    System.out.print("Enter the contact number to edit: ");
	                    int editIndex = scanner.nextInt() - 1;
	                    scanner.nextLine();  // Clear the buffer
	                    System.out.print("Enter new Name: ");
	                    String newName = scanner.nextLine();
	                    System.out.print("Enter new Phone Number: ");
	                    String newPhoneNumber = scanner.nextLine();
	                    System.out.print("Enter new Email: ");
	                    String newEmail = scanner.nextLine();
	                    contactManager.editContact(editIndex, newName, newPhoneNumber, newEmail);
	                    break;
	                case 4:
	                	 contactManager.viewContacts();
	                    System.out.print("Enter the contact number to delete: ");
	                    int deleteIndex = scanner.nextInt() - 1;
	                    contactManager.deleteContact(deleteIndex);
	                    break;
	                case 5:
	                    System.out.println("Exiting Contact Manager.");
	                    scanner.close();
	                    return;
	                default:
	                    System.out.println("Invalid option. Please try again.");
	            }
	}
	}
}




		
	