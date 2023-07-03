package deitel.chapter4;

import java.util.Scanner;

public class CreditLimitCalculator {
    public static void main(String[] args) {
      String  accountNumber;
        int balanceAtTheBeginningOfTheMonth;
         int totalOfAllItemsChargedByTheCustomerThisMonth;
         int totalOfAllCreditsAppliedToTheCustomersAccountThisMonth;
         int allowedCreditLimit;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Account number:");
        accountNumber = input.nextLine();
        System.out.println("Enter balance at the beginning of the month:");
        balanceAtTheBeginningOfTheMonth = input.nextInt();
        System.out.println("Enter totalOfAllItemsChargedByTheCustomerThisMonth");
        totalOfAllItemsChargedByTheCustomerThisMonth = input.nextInt();
        System.out.println("Enter totalOfAllCreditsAppliedToTheCustomersAccountThisMonth");
        totalOfAllCreditsAppliedToTheCustomersAccountThisMonth = input.nextInt();
        System.out.println("Enter allowedCreditLimit");
        allowedCreditLimit = input.nextInt();

         int newBalance = balanceAtTheBeginningOfTheMonth + totalOfAllItemsChargedByTheCustomerThisMonth -totalOfAllCreditsAppliedToTheCustomersAccountThisMonth;
        System.out.println("your new balance is " + newBalance);
        if (newBalance > allowedCreditLimit){
            System.out.println("you have exceeded your limits");
        }

    }
}
