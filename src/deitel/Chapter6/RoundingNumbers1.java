package deitel.Chapter6;

import SoftPractice.MathsFloor;

import java.util.Scanner;

public class RoundingNumbers1 {
    public static void main(String[] args) {
        System.out.println(RoundingNumbers1.roundNumber());

    }

    public static double roundNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number with decimal values.");
        double numbers = input.nextDouble();
         numbers = Math.floor(numbers-0.5);
         return numbers ;

    }
}
