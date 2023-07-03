package deitel.chapter4;

import java.util.Scanner;

public class TaxCalculator {
    public static void main(String[] args) {
         int rate;
         int year;
         int earnings;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter earnings : ");
        earnings = input.nextInt();
        System.out.println("Enter year :");
        year = input.nextInt();
        System.out.println("Enter rate :");
        rate =input.nextInt();

        int tax = (earnings * rate * year)/100;
        //if (earnings <= 30000){rate = 15;} else if (earnings > 30000) {rate = 20;}

        System.out.println(" your tax is "+ tax);

    }
}
