package Assigments;

import java.util.Scanner;

public class RaisedToPower {
    public static void main(String[] args){
        Scanner input =new Scanner (System.in);
        System.out.println("enter  first number:");
        int firstNumber = input.nextInt();
        System.out.println("enter second number:");
        int secondNumber = input.nextInt();
        int pow=1;
        while (secondNumber!=0){
             pow = firstNumber * pow;
            secondNumber--;
            System.out.println(pow);
        }


    }
}

