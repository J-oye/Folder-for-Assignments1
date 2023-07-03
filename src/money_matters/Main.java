package money_matters;

import java.util.Scanner;

public class Main {
    private static final Bank jomeshBank = new Bank();
    private static final Scanner userInput  = new Scanner(System.in);
    private static String prompt;

    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu(){
        display("===================JOMESHBANK====================" +
                "\n1 -> Create New Account" +
                "\n2 -> CheckBalance" +
                "\n3 -> Deposit" +
                "\n4 -> WithDraw" +
                "\n5 -> Transfer" +
                "\n6 -> Exit" +
                "\n=====================WELCOME======================");
        display("choose any option to continue");
        prompt = userInput.nextLine();
        switch (prompt){
            case "1" ->{
                String name = input(" please Enter name");
                String email = input(" please Enter Email");
                String phoneNumber = input(" please Enter phoneNumber");
                jomeshBank.createNewUser(name,email,phoneNumber);
                display("Account Created Successfully, well done "+ name);
                displayMainMenu();
            }
            case "2" ->{
                String accountNumber = input("Enter AccountNumber");
                String pin = input("Enter pin");
                jomeshBank.checkBalance(accountNumber,pin);
                displayMainMenu();
            }
            case "3" ->{
                String accountNumber = input("Enter AccountNumber");
                int amount = Integer.parseInt(input("Enter amount"));
                jomeshBank.deposit(accountNumber,amount);
                displayMainMenu();
            }
            case "4" ->{
                String accountNumber = input("Enter AccountNumber");
                int amount = Integer.parseInt(input("Enter amount"));
                String pin = input("Enter pin");
                jomeshBank.withdraw(accountNumber,amount,pin);
                displayMainMenu();
            }
            case "5"->{
                display("TRANSFER NOT AVAILABLE NOW , TRY AGAIN LATER");
//                String senderAccountNumber = input("Enter SenderAccountNumber");
//                String receiverAccount =input("Enter receiverAccountNumber");
//                int amount = Integer.parseInt(input("Enter amount"));
//                String pin = input("Enter pin");
//                jomeshBank.transfer(senderAccountNumber,receiverAccount,amount,pin);
                displayMainMenu();
            }
            case "6" ->{
                display("Thank you for using JOMESHBANK. ");
            }
        }


    }

    public static void display(String messages){
        System.out.println(messages);
    }
    public  static  String input(String prompt){
        display(prompt);
        return userInput.nextLine();
    }
}

