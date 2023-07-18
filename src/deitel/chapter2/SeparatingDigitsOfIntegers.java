package deitel.chapter2;

import java.util.Scanner;

public class SeparatingDigitsOfIntegers {
    public static void main(String[] args) {
        int number = 42339;
        int digit  = number%10;
        int digit2 = number /10;
        int d3 = digit2 %10;
        int real = number / 100;
        int d4 = real % 10;
        int goAgain =  number / 1000;
        int d5 = goAgain % 10;
        int last = number / 10000;
        int d6 = last % 10;

        System.out.println(d6);
        System.out.println(d5);
        System.out.println(d4);
        System.out.println(d3);
        System.out.println(digit);

        int sum = d6 + d5 + d4 + d3 + digit;
        System.out.println(sum);
    }
}
