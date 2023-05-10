package Assigments;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number: ");
       int factorial = input.nextInt();
        int i,fact = 1;
        for (i =1; i<= factorial; i++){
            fact = fact *i;
        }
        System.out.println("The factorial of" +" " + factorial+" " +"is " +" " + fact);




    }
}
