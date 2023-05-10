package deitel.chapter2;

import java.util.Scanner;

public class SeparatingDigitsOfIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number consisting of five digits:");
        int number = input.nextInt();
        if (number / 10 > 0){
        }
        System.out.printf("%d", number % 10);
    }
}
