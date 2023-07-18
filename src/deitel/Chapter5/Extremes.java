package deitel.Chapter5;

import java.util.Scanner;

public class Extremes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many numbers do you want to work with :");
        int userInput = input.nextInt();
        int min =0;
        int max = 0;
        int number ;
        for (int index = 0; index < userInput ; index++) {
            System.out.println("Enter a number  : ");
            number = input.nextInt();

            if(number > max){
                max = number;
            }
            if (min <= number){
                min = number;
            }

        }
        System.out.println("Maximum number = "+ max);
        System.out.println("minimum number = "+ min);

        }

    }



