package deitel.Chapter5;

import java.util.Scanner;

public class Exercise {
    public static void main(String[]args) {
        int number = 30;
        int sum = 0;

        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0) {

                sum = sum + i;
            }
            System.out.println(sum);

        }

    }}