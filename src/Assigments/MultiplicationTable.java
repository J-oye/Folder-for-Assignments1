package Assigments;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number:");
        int number = input.nextInt();
        for (int i =1;i<=number;i++){
            System.out.println(i+"  *  "+number+" = "+"  "+i * number);
        }
    }
}
