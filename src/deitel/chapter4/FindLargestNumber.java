package deitel.chapter4;

import java.util.Scanner;

public class FindLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest =0;

        while (counter<10){
            System.out.println("Enter a number :");
            number = input.nextInt();
             if (number > largest){
                 largest = number;

             }
            System.out.println("the largest number is "+ largest);
        }

    }

}
