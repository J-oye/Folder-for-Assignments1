package my_phone;

import java.util.Scanner;

public class Main {
    private static PhoneBook phoneBook = new PhoneBook();
    private  static String prompt;
   private static Scanner userInput = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();

    }
    public static void displayMainMenu(){
        display("======================== WELCOME" + " ======================="
                +
                " \n1->.Create Contacts" +
                " \n2->.Delete Contact" +
                " \n3->.search Contacts By Name" +
                "\n==========================================================" );
        display("choose an option to continue " );
        prompt = userInput.nextLine();
        switch (prompt) {
            case "1" -> {
                createContact();
            }
            case "2" -> {
                deleteContact();
            }
            case "3" ->{
                searchContactByName();
            }
        }

    }

    private static void searchContactByName() {
//        PhoneBook phoneBook = new PhoneBook();
        String name = input("Enter  name");
        phoneBook.searchContactByName(name);
        displayMainMenu();
    }

    private static void deleteContact() {
//        PhoneBook phoneBook = new PhoneBook();
        String name = input("Contact Name");
        phoneBook.deleteContact(name);
       // display("Contacted Deleted");
        displayMainMenu();
    }

    private static void createContact() {
//        PhoneBook phoneBook = new PhoneBook();
        String name = input("Enter  name");
        String phoneNumber = input("Enter phone number");
        String email = input("Enter email");
        phoneBook.createNewContact(name, phoneNumber, email);
        display("contact Saved Successfully");
        displayMainMenu();
    }

    public static  void display(String messages){
         System.out.println(messages);
     }
    public static String input(String prompt){
        display(prompt);
        return userInput.nextLine();
    }
}
