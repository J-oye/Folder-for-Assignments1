package deitel.chapter2;

import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter a number");
        int number1 = input.nextInt();
        System.out.println("Enter a number");
        int number2 = input.nextInt();
            int multiple = number2+ number2 / (number1 *3);
        System.out.println(multiple);

    }
}
