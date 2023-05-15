package Assigments;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class CreditCardValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, Kindly Enter Card details to verify :");
        String cardDetails = input.nextLine();
        String[]arr = new String[cardDetails.length()];
        for (int index = 0; index < arr.length; index++) {
            for (int i = index; i < arr.length; i++) {
            }

            if (Objects.equals(arr[0], "4")){
                System.out.println("Credit Card Type: visa Card");
            }
            else
            if (Objects.equals(arr[0],"5")){
                System.out.println(" Credit Card Type: MasterCard");
            }
            else
                if (Objects.equals(arr[0],"37")) {
                    System.out.println(" Credit Card Type:America Express Card");
                } else if (Objects.equals(arr[0],"6")) {
                    System.out.println(" Credit Card Type: Discover Card");

                }


        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Credit Card Digit Length:" +" "+ arr.length);

    }
    public void  CardValidation(){
        String[]arr = new String[cardDetails.length()];
        for (int index = 0; index < arr.length; index++) {
            for (int i = index; i < arr.length; i++) {
            }

        }

    }






}
