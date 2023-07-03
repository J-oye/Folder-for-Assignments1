package deitel.chapter4;

import java.util.Scanner;

public class SalesCommissionCalculator {
    public static void main(String[] args) {
        int grossCommission = 9;
        int earningPerWeek = 200;
        double valueWorth;
        double totalValueWorth = 0;
        double totalEarning = 0;
        int exit = -1;
        int item =0;


        Scanner input = new Scanner(System.in);
        System.out.println("Enter value worth  or press -1 to stop: ");
        valueWorth =input.nextDouble();

        while (item !=exit){
            System.out.println("Enter value worth  or press -1 to stop: ");
            if (item == exit){
                break;}

             valueWorth =input.nextDouble();
            System.out.println("Enter value worth  or press -1 to stop: ");
            totalValueWorth += valueWorth;
            totalEarning = ((totalValueWorth * grossCommission)/100 )+ earningPerWeek;
            System.out.println("Enter value worth  or press -1 to stop: ");
            valueWorth =input.nextDouble();





        }
        System.out.println("sales person's earning for the week is " + totalEarning);
    }

}
