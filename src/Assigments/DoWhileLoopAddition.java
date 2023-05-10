package Assigments;

import java.util.Scanner;

public class DoWhileLoopAddition {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
        System.out.println("please enter first number:");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number :");
        int secondNumber = input.nextInt();
        do {
            System.out.println(firstNumber+secondNumber);
            System.out.println("do you wish to continue adding numbers?(yes/no)");
            input.hasNextBoolean();

            break;

        }while (input.hasNextBoolean());


    }
}
