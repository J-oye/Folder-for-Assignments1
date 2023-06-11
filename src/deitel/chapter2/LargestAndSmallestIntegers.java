package deitel.chapter2;

import java.util.Scanner;

public class LargestAndSmallestIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");
        int number1 = input.nextInt();
        System.out.println("Enter a number");
        int number2 = input.nextInt();
        System.out.println("Enter a number");
        int number3 = input.nextInt();
        System.out.println("Enter a number");
        int number4 = input.nextInt();
        System.out.println("Enter a number");
        int number5 = input.nextInt();

        int largest;
        int smallest;

        if (number1 > number2 && number1 > number3 && number1 > number4 && number1 >number5){
            largest = number1;
            System.out.println("the largest number is " + largest);
        }else if (number2 > number1 && number2 > number3 && number2 > number4 && number2 >number5){
            largest = number2;
            System.out.println("the largest number is " + largest);
        }else if (number3 > number1 && number3 > number2 && number3 > number4 && number3 >number5){
            largest = number3;
            System.out.println("the largest number is " + largest);
        }else if (number4 > number1 && number4 > number2 && number4 > number3 && number4 >number5){
            largest = number4;
            System.out.println("the largest number is " + largest);
        }else if (number5 > number1 && number5 > number2 && number5 > number3 && number5 >number4){
            largest = number5;
            System.out.println("the largest number is " + largest);
        }
        if (number1 < number2 && number1 < number3 && number1 < number4 && number1 < number5){
            smallest = number1;
            System.out.println("the smallest number is " + smallest);
        }else if (number2 < number1 && number2 < number3 && number2 < number4 && number2 < number5){
            smallest = number2;
            System.out.println("the smallest number is " + smallest);
        }else if (number3 < number1 && number3 < number2 && number3 < number4 && number3 < number5){
            smallest = number3;
            System.out.println("the smallest number is " + smallest);
        }else if (number4 < number1 && number4 < number2 && number4 < number3 && number4 < number5){
            smallest = number4;
            System.out.println("the smallest number is " + smallest);
        }else if (number5 < number1 && number5 < number2 && number5 < number3 && number5 < number4){
            smallest = number5;
            System.out.println("the smallest number is " + smallest);
        }
    }
}
