//package deitel.chapter3;
//
//import java.util.Scanner;
//
//public class ModifiedAccountTest {
//        public static void main(String[] args) {
//            displayAccount();
//
//            Scanner input = new Scanner(System.in);
//            System.out.print("Enter deposit amount for account1: ");
//            double depositAmount = input.nextDouble();
//            System.out.printf("%n adding %.2f to account1 balance%n%n",
//                    depositAmount);
//            account1.deposit(depositAmount);
//
//
//
//            System.out.printf("%s balance: $%.2f%n",
//                    account1.getName(), account1.getBalance());
//
//            System.out.print("Enter Withdraw amount for account1: ");
//            double withDrawAmount = input.nextDouble();
//            account1.withDraw(withDrawAmount);
//            System.out.printf("%s balance: $%.2f%n",
//                    account1.getName(), account1.getBalance());
//
//
//            System.out.print("Enter deposit amount for account2: ");
//            depositAmount = input.nextDouble();
//            System.out.printf("%n adding %.2f to account2 balance%n%n",
//                    depositAmount);
//            account2.deposit(depositAmount);
//
//            System.out.printf("%s balance: $%.2f%n%n",
//                    account2.getName(), account2.getBalance());
//
//            System.out.print("Enter Withdraw amount for account2: ");
//             withDrawAmount = input.nextDouble();
//            account2.withDraw(withDrawAmount);
//
//            System.out.printf("%s balance: $%.2f%n%n",
//                    account2.getName(), account2.getBalance());
//
//
//        }
//    public static void displayAccount(ModifiedAccount accountToDisplay ){
//        ModifiedAccount account1 = new ModifiedAccount("Jane Green", 50.00);
//        ModifiedAccount account2 = new ModifiedAccount("John Blue", -7.53);
//        if (accountToDisplay == account1){
//            System.out.printf("%s balance: $%.2f%n",
//                    account1.getName(), account1.getBalance());
//        }
//        if (accountToDisplay == account2){
//            System.out.printf("%s balance: $%.2f%n%n",
//                    account2.getName(), account2.getBalance());
//        }
//
//
//
//
//    }
//
//    }
//
//
