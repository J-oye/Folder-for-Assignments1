package deitel.chapter4;

import java.util.Scanner;

public class ReadingNumbersUntilSpecifiedSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
         int number =input.nextInt();
         int count = 0;
         int sum = 0;

         while (sum != number ){
             System.out.println("enter a number :");
             number = input.nextInt();
             sum += number;
             System.out.println(sum);
             count++;
         }

    }
}
