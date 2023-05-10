package Assigments;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number: ");
        int number = input.nextInt();
        if (number>=1&& number% number==0){
            System.out.println(number+" "+"is a prime number ");
        }
        else System.out.println(number+" "+ "is not a prime number.");

    }
}
