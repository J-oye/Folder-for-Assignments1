package deitel.chapter4;

import java.util.Scanner;

public class FindTwoLargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = 1;
        int number;
        int largest =0;
        int secondLargest =0;

        while (counter<10) {
            System.out.println("Enter a number :");
            number = input.nextInt();
            if (number > largest) {
                largest = number;
            }else
            if (number < largest && number  > secondLargest){
                secondLargest = number;
            }
            counter++;
            System.out.println("the largest number is "+largest);
            System.out.println("the second largest number is "+ secondLargest);
        }
    }
}
