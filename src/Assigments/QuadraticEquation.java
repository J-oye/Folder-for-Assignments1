package Assigments;

import java.util.Scanner;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = input.nextInt();
        System.out.println("Enter the value of b");
        int b = input.nextInt();
        System.out.println("Enter the value of c");
        int c = input.nextInt();
        int x = -b*b -4 * a *c;
        if (x==0)
        System.out.println("this is the root of a,b,c");


    }
}
