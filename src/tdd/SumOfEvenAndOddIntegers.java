package tdd;

import java.util.Scanner;

public class SumOfEvenAndOddIntegers {
    public static void main(String[] args){
        Scanner input =new Scanner(System.in);
       int evenSum = 0;
       int oddSum = 0;
        int number;
        System.out.println("Please enter a number");
        number =input.nextInt();

        for (int i =1;i<number;i++){
            if (i%2==0){evenSum = evenSum+i;}
            else
                oddSum =oddSum+i;
            System.out.println("evenSum");
            System.out.println("oddSum");
        }
        System.out.println("/n The sum of even numbers upto"+number+"="+evenSum);
        System.out.println("/n The sum of odd numbers upto"+number+"="+oddSum);
    }
}
