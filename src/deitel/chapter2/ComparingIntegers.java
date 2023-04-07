package deitel.chapter2;

import java.util.Scanner;

public class ComparingIntegers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int Number1 = input.nextInt();
        System.out.println("Enter another number");
        int Number2 = input.nextInt();
        System.out.println("Enter one more number");
        int Number3 = input.nextInt();
        if (Number1 * Number1 >= 100) {
            System.out.println("Number1 is greater than | equals to 100");
        }
        else if(Number1*Number1<=100){
                System.out.println("Number1 is less than  | equals to 100");
            }
            if(Number2*Number2>=100){
                System.out.println("NUmber2 is greater than | equals to 100");
            }
            else if(Number2*Number2<=100){
                    System.out.println("Number2 is less than| equals to 100");
                }
            if(Number3 *Number3>=100){
                System.out.println("Number3 is greater than | equals to 100");
            }
            else if (Number3*Number3<=100) {
                System.out.println("Number3 is less than | euqals to 100");
            }
            else System.out.println("0");


    }
}
