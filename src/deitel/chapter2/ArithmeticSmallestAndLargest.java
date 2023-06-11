package deitel.chapter2;

import java.util.Scanner;

public class ArithmeticSmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number1 = input.nextInt();
        System.out.println("Enter a number:");
        int number2 = input.nextInt();
        System.out.println("Enter a number:");
        int number3 = input.nextInt();

        int sum = number1 + number2 + number3;
        System.out.println(sum +" is the sum of the  numbers  " );

        int product = number1 * number2 * number3;
        System.out.println( product + " is the product of the numbers  ");

        int average =  number1 + number2 + number3 % 3;
        System.out.println(average + " is the average of the numbers");



        int largest;
        int smallest;

        if (number1 > number2 && number1 > number3){
            largest = number1;
            System.out.println("the largest number is "+ largest);
        }else if (number2 > number1 && number2 > number3){
            largest = number2;
            System.out.println("the largest number is "+ largest);
        }else if (number3 > number1 && number3 > number2){
            largest = number3;
            System.out.println("the largest number is "+ largest);
        }
        if (number1 < number2 && number1 < number3){
            smallest = number1;
            System.out.println("the smallest number is "+ smallest);
        }else if (number2 < number1 && number2 < number3){
            smallest = number2;
            System.out.println("the smallest number is "+ smallest);
        }else if (number3 < number1 && number3 < number2){
            smallest = number3;
            System.out.println("the smallest number is "+ smallest);
        }

    }
}
