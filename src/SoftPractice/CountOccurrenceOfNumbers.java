package SoftPractice;

import java.util.Scanner;

public class CountOccurrenceOfNumbers {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        System.out.println("please enter a number");
        int number = input.nextInt();
        int counter = 0;
        for (int i = 0; i < number; i++) {
            if (number == number){
                counter =counter+1;
            }
            System.out.println(counter);

        }
    }
}
