package deitel.chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("Enter firstNumber");
        int firstNumber = input.nextInt();
        System.out.println("Enter secondNumber");
        int secondNumber = input.nextInt();
        int firstNumberSquare= firstNumber * firstNumber;
        int secondNumberSquare = secondNumber * secondNumber;
        int sum = ((firstNumber*firstNumber)+(secondNumber*secondNumber));
        int difference = firstNumberSquare - secondNumberSquare;
        System.out.println("difference of first and second number is "+difference);
        System.out.println("square of first number is "+firstNumberSquare);
        System.out.println("square of second number is "+secondNumberSquare);
        System.out.printf("Sum is %d%n", sum);
    }
}
