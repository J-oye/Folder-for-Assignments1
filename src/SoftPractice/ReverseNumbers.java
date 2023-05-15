package SoftPractice;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number:");
        int number = input.nextInt();
        System.out.println(number);
        int reverseNumber = 0;
        while (number!= 0){
            reverseNumber = reverseNumber * 10 + number % 10;
            number/= 10;
        }

        System.out.println(reverseNumber);
    }
}
