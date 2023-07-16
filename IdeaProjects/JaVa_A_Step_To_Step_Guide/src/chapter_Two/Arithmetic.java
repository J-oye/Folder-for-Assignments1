package chapter_Two;

/*(Arithmetic) Write an application that asks the user to enter two integers, obtains them from
        the user and prints the square of each, the sum of their squares, and the difference of the squares (first
        number squared minus the second number squared).**/

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        // create a Scanner to collect user input;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number :");                 //prompt
        int firstNumber = input.nextInt();                     //read firstNumber from user
        System.out.println("Enter a Number :");               //Prompt
        int secondNumber = input.nextInt();

        int firstNumberSquare = firstNumber * firstNumber;//find the square and stores it in first number square
        int secondNumberSquare = secondNumber * secondNumber;//finds the square of second number and stores it in second number square

        int sum = firstNumberSquare + secondNumberSquare;//adds the square  numbers and stores the result in sum

        int squareDifference = firstNumberSquare - secondNumberSquare;//finds the square difference of the two numbers rom subtracting the square of one from the other.

        System.out.println("square of first Number is "+firstNumberSquare);//displays square of number one
        System.out.println("square of second Number is "+ secondNumberSquare);//displays square of number two
        System.out.println("the sum of square for the two number is "+sum);// displays sum
        System.out.println("the square difference of the two numbers is "+squareDifference);// displays square
    }
}
