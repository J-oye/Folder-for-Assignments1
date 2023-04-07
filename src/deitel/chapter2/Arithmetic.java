package deitel.chapter2;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args){
      Scanner input = new Scanner(System.in);
        System.out.println("Enter firstNumber");
        int firstNumber = input.nextInt();
        System.out.println("Enter secondNumber");
        int secondNumber = input.nextInt();
        int sum = ((firstNumber*firstNumber)+(secondNumber*secondNumber)-firstNumber&secondNumber);
        System.out.printf("Sum is %d%n", sum);
    }
}
